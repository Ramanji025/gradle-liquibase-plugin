package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the status command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class StatusCommand extends LiquibaseCommand {

    StatusCommand() {
        description = 'Generate a list of pending changesets.'
        command = 'status'
        legacyCommand = 'status'
        commandArguments = [
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                CHANGELOG_FILE,
                CONTEXTS,
                LABEL_FILTER,
                LABELS,
                VERBOSE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }

}
