package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the sync-hub command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class SyncHubCommand extends LiquibaseCommand {

    SyncHubCommand() {
        description = 'Synchronize the local DatabaseChangeLog table with Liquibase Hub.'
        command = 'sync-hub'
        legacyCommand = 'syncHub'
        commandArguments = [
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                CHANGELOG_FILE,
                HUB_CONNECTION_ID,
                HUB_PROJECT_ID,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
