package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the update command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UpdateCommand extends LiquibaseCommand {

    UpdateCommand() {
        description = 'Deploy any changes in the changelog file that have not been deployed.'
        command = 'update'
        legacyCommand = 'update'
        commandArguments = [
                CHANGELOG_FILE,
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                LABEL_FILTER,
                LABELS,
                CONTEXTS,
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
