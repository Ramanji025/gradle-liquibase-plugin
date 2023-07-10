package io.github.ramanji025.liquibase.gradle

import org.gradle.api.GradleException

/**
 * Custom Gradle exception thrown by the plugin when the plugin hasn't been configured correctly.
 *
 * @author Ramanjaneyulu Pathuri
 */
class LiquibaseConfigurationException extends GradleException {
    LiquibaseConfigurationException(String msg) {
        super(msg)
    }

}
