package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback-count command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackCountCommand extends LiquibaseCommand {

    RollbackCountCommand() {
        description = 'Rollback the last <liquibaseCommandValue> changes.'
        command = 'rollback-count'
        legacyCommand = 'rollbackCount'
        requiresValue = true
        valueArgument = COUNT
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
                COUNT,
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
