package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the execute-sql command when running with a file argument.  This command
 * Doesn't really exist in Liquibase, but is a bit of syntactic sugar to make running SQL files
 * easier to deal with.  It runs the "execute-sql" command, but assumes the value argument is
 * "sql-file".
 *
 * @author Ramanjaneyulu Pathuri
 */
class ExecuteSqlFileCommand extends LiquibaseCommand {

    ExecuteSqlFileCommand() {
        description =  'Execute a SQL file given in <liquibaseCommandValue>"'
        // These are not the arguments that will be executed, but we need unique command to create
        // our tasks correctly.  Argument builders will need to treat this as a special case.
        command = 'execute-sql-file'
        legacyCommand = 'executeSqlFile'
        requiresValue = true
        valueArgument = SQL_FILE
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
