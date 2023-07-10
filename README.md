Liquibase Gradle Plugin
-----------------------

#### 1. Including the plugin
To include the plugin into Gradle builds, simply add the following to your build.gradle file:

```groovy
plugins {
  id 'io.github.ramanji025.gradle.liquibase.plugin' version '1.0.0'
}
```

If you have a lot of dependencies from your project that you need to have in the liquibase
classpath, you could also make `liquibaseRuntime` extend another configuration like this:

```groovy
configurations {
  liquibaseRuntime.extendsFrom runtime
}
```

Or, if you don't already have a `configurations` block, you can simply add
`configurations.liquibaseRuntime.extendsFrom configurations.runtime` to your build.gradle file.

```groovy
liquibase {
  jvmArgs "-Duser.dir=$project.projectDir" 
}
```

*Example1:*

A simple example might look like this:

```groovy
liquibase {
  activities {
    main {
      changelogFile 'src/main/db/main.groovy'
      url project.ext.mainUrl
      username project.ext.mainUsername
      password project.ext.mainPassword
      logLevel "info"
    }
  }
}
```

This example will work for many, if not most projects.  It defines the parameters that all commands
will need, such as username and password, and there is only one activity.

*Example2:*

The plugin allows you to be much more complex if your situation requires it.

Let's suppose that for each deployment, you need to update the data model for your application's
database, and you also need to run some SQL statements in a separate database used for security.  
Additionally, you want to occasionally run a diff between the changelog and the database.  The
`liquibase` block might look like this:

```groovy
liquibase {
  activities {
    main {
      changelogFile 'src/main/db/main.groovy'
      url project.ext.mainUrl
      username project.ext.mainUsername
      password project.ext.mainPassword
      logLevel "info"
    }
    security {
      changelogFile 'src/main/db/security.groovy'
      url project.ext.securityUrl
      username project.ext.securityUsername
      password project.ext.securityPassword
      logLevel "info"
    }
    diffMain {
      changelogFile 'src/main/db/main.groovy'
      url project.ext.mainUrl
      username project.ext.mainUsername
      password project.ext.mainPassword
      difftypes 'data'
      logLevel "info"
    }
  }
  runList = project.ext.runList
}
```

There are a few things to keep in mind when setting up the `liquibase` block:

1. We only need one activity block for each type of activity.  In the example above, the database
   credentials are driven by build properties so that the correct database can be specified at build
   time so that you don't need a separate activity for each database.

2. By making the value of `runList` a property, you can determine the activities that get run at
   build time.  For example, if you didn't need to run the security updates in the CI environment,
   you could type `gradle update -PrunList=main` For environments where you do need the security
   updates, you would use `gradle update -PrunList='main,security'`.  To do a diff, you'd run
   `gradle diff -PrunList=diffMain`.  This use of properties is the reason the runList is a string
   and not an array.

3. The methods in each activity block are meant to be pass-throughs to Liquibase.  Any valid
   Liquibase command parameter is a legal method here.  The command parameters are parameters in the
   Liquibase documentation that start with a `--` such as `--difftypes` or `--logLevel`.  For
   example, if you wanted to increase the log level, you could add `logLevel 'debug'` to the
   activity.

4. In addition to the command pass-through methods of an activity, there is a `changeLogParameters`
   method.  This method takes a map, and is used to set up token substitution in the changeLogs.  See
   the Liquibase documentation for more details on token substitution.

5. Some Liquibase commands like `tag` and `rollback` require a value, in this case a tag name.  
   Since the value will likely change from run to run, the command value is not configured in the
   `liquibase` block.  To supply a command value, add `-PliquibaseCommandValue=<value>` to the
   gradle command.

6. Optionally, if you want to use a different entry point than the default
   `liquibase.integration.commandline.Main`, you can configure a different main class. This is
   useful if you want, for instance, to derive certain company-specific parameters.

