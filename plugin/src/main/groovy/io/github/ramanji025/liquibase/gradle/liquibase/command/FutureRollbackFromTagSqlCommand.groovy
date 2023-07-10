
package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the future-rollback-from-tag-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class FutureRollbackFromTagSqlCommand extends LiquibaseCommand {

    FutureRollbackFromTagSqlCommand() {
        description = 'Generates SQL to revert future changes up to the <liquibaseCommandValue> tag, and writes it to <liquibaseOutputFile>, or STDOUT if no file is specified.'
        command = 'future-rollback-from-tag-sql'
        legacyCommand = 'futureRollbackFromTagSql'
        requiresValue = true
        valueArgument = TAG
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
                TAG,
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }
}
