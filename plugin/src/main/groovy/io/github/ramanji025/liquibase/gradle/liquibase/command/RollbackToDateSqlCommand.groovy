package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback-to-date-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackToDateSqlCommand extends LiquibaseCommand {

    RollbackToDateSqlCommand() {
        description =  'Generate the SQL to rollback changes made to the database since the <liquibaseCommandValue> date/time.'
        command =  'rollback-to-date-sql'
        legacyCommand = 'rollbackToDateSql'
        requiresValue =  true
        valueArgument =  DATE
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
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }
}
