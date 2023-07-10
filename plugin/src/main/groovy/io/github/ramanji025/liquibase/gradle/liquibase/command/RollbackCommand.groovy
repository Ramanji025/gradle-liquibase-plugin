package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackCommand extends LiquibaseCommand {

    RollbackCommand() {
        description = 'Rollback changes made to the database since the the <liquibaseCommandValue> tag was applied.'
        command = 'rollback'
        legacyCommand = 'rollback'
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
                ROLLBACK_SCRIPT,
                TAG,
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
