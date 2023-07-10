package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the update-count command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UpdateCountCommand extends LiquibaseCommand {

    UpdateCountCommand() {
        description = 'Deploy the next <liquibaseCommandValue> changes from the changelog file.'
        command = 'update-count'
        legacyCommand = 'updateCount'
        requiresValue = true
        valueArgument = COUNT
        commandArguments = [
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                CHANGELOG_FILE,
                LABEL_FILTER,
                LABELS,
                CONTEXTS,
                COUNT,
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
