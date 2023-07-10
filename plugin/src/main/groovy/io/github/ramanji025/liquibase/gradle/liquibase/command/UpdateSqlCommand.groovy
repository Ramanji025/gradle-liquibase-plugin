package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the update-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UpdateSqlCommand extends LiquibaseCommand {

    UpdateSqlCommand() {
        description = 'Writes SQL to update the database to the current version to <liquibaseOutputFile> or STDOUT of no file is specified.'
        command = 'update-sql'
        legacyCommand = 'updateSql'
        commandArguments = [
                CHANGELOG_FILE,
                URL_ARG,
                DEFAULT_CATALOG_NAME,
                DEFAULT_SCHEMA_NAME,
                USERNAME,
                PASSWORD,
                LABEL_FILTER,
                LABELS,
                CONTEXTS,
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }
}
