package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback-sq1 command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackSqlCommand extends LiquibaseCommand {

    RollbackSqlCommand() {
        description =  'Generate SQL to roll back the database to the state it was in when the <liquibaseCommandValue> tag was applied.'
        command =  'rollback-sql'
        legacyCommand = 'rollbackSql'
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
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }
}
