Liquibase Plugin
-----------------------

#### 1. Including the plugin
To include the plugin into Gradle builds, simply add the following to your build.gradle file:

```groovy
plugins {
  id 'io.github.ramanji025.liquibase.plugin' version '1.0.0'
}
```
```Acceptance Notes to Gradle Team

The original plugin is built on top of Java 8 and not compatable to the Java 17 version.
Contributed to the original repository but the Pr request are not accepting due some problems from their end.
Plublishing this plugin will be helpful for number of people who are blocked due to Java 17 upgrade.

```