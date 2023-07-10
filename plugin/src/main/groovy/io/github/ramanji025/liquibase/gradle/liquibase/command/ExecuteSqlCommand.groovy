package io.github.ramanji025.liquibase.gradle.liquibase.command

import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the execute-sql command when running with a SQL argument.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ExecuteSqlCommand extends LiquibaseCommand {

    ExecuteSqlCommand() {
        description =  'Execute a SQL string given in <liquibaseCommandValue>"'
        command = 'execute-sql'
        legacyCommand = 'executeSql'
        requiresValue = true
        valueArgument = SQL
        commandArguments = [
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                SQL,
                SQL_FILE,
                DELIMITER,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
