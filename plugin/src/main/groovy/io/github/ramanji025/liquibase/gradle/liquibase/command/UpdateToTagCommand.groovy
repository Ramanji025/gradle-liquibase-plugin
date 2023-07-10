package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the update-to-tag command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UpdateToTagCommand extends LiquibaseCommand {

    UpdateToTagCommand() {
        description = 'Deploy changes from the changelog file to the <liquibaseCommandValue> tag.'
        command = 'update-to-tag'
        legacyCommand = 'updateToTag'
        requiresValue = true
        valueArgument = TAG
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
                TAG,
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }

}
