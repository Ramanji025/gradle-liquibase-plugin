package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback-to-date command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackToDateCommand extends LiquibaseCommand {

    RollbackToDateCommand() {
        description = 'Rollback changes made to the database since the <liquibaseCommandValue> date/time.'
        legacyCommand = 'rollbackToDate'
        command = 'rollback-to-date'
        requiresValue = true
        valueArgument = DATE
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
                ROLLBACK_SCRIPT,
                DATE,
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }

}
