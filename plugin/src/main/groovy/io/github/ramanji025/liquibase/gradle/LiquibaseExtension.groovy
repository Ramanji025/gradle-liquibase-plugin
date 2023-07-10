package io.github.ramanji025.liquibase.gradle

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.artifacts.Configuration

/**
 * This is the Gradle extension that configures the Liquibase plugin.  All configuration options
 * will be in the {@code liquibase} block of the build.gradle file.  This block consists of a list
 * of activities and a run list.
 *
 * @author Ramanjaneyulu Pathuri
 */
class LiquibaseExtension {
    final NamedDomainObjectContainer<Activity> activities

    /**
     * Define the name of the Main class in Liquibase that the plugin should call to run Liquibase
     * itself.
     */
    def mainClassName

    /**
     * Define the JVM arguments to use when running Liquibase.  This defaults to an empty array,
     * which is almost always what you want.
     */
    def jvmArgs = []

    /**
     * Define the list of activities that run for each liquibase task.  This is a string of comma
     * separated activity names.  This is a string instead of an array to facilitate the use of
     * Gradle properties.  If no runList is defined, the plugin will run all activities.
     */
    def runList

    LiquibaseExtension(NamedDomainObjectContainer<Activity> activities) {
        this.activities = activities
    }

    def activities(Closure closure) {
        activities.configure(closure)
    }
}
