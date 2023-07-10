package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the future-rollback-count-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class FutureRollbackCountSqlCommand extends LiquibaseCommand {

    FutureRollbackCountSqlCommand() {
        description = 'Generates SQL to sequentially revert <liquibaseCommandValue> changes the database.'
        command = 'future-rollback-count-sql'
        legacyCommand = 'futureRollbackCountSql'
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
                COUNT,
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }
}
