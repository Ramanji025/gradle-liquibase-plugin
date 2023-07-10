package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the update-count-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UpdateCountSqlCommand extends LiquibaseCommand {

    UpdateCountSqlCommand() {
        description = 'Generate the SQL to deploy the next <liquibaseCommandValue> changes from the changelog file.'
        command = 'update-count-sql'
        legacyCommand = 'updateCountSql'
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
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }

}
