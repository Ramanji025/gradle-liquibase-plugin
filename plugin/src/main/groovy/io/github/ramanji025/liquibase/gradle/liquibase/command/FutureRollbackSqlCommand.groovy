
package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the future-rollback-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class FutureRollbackSqlCommand extends LiquibaseCommand {

    FutureRollbackSqlCommand() {
        description =  'Generate the raw SQL needed to rollback undeployed changes to <liquibaseOutputFile> or to STDOUT if no value is specified.'
        command =  'future-rollback-sql'
        legacyCommand = 'futureRollbackSql'
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
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }
}
