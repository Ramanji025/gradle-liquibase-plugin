package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the validate command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ValidateCommand extends LiquibaseCommand {

    ValidateCommand() {
        description = 'Validate the changelog for errors.'
        command = 'validate'
        legacyCommand = 'validate'
        commandArguments = [
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                CHANGELOG_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
