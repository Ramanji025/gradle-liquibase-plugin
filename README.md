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