package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback-count-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackCountSqlCommand extends LiquibaseCommand {

    RollbackCountSqlCommand() {
        description = 'Write SQL to roll back the last <liquibaseCommandValue> changes to <liquibaseOutputFile> or STDOUT if no file is specified.'
        command = 'rollback-count-sql'
        legacyCommand = 'rollbackCountSql'
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
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }
}
