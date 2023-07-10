package io.github.ramanji025.liquibase.gradle.liquibase.command

import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the drop-all command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class DropAllCommand extends LiquibaseCommand {

    DropAllCommand () {
        description = 'Drop all database objects owned by the user. Note that functions, procedures and packages are not dropped (Liquibase limitation)'
        command = 'drop-all'
        legacyCommand = 'dropAll'
        commandArguments = [
                USERNAME,
                PASSWORD,
                URL_ARG,
                DEFAULT_CATALOG_NAME,
                DEFAULT_SCHEMA_NAME,
                SCHEMAS,
                CHANGELOG_FILE,
                HUB_CONNECTION_ID,
                HUB_PROJECT_ID,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
