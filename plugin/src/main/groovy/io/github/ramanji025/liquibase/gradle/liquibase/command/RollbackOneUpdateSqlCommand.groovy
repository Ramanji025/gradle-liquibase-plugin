package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback-one-update-sql command.  This Liquibase Pro command doesn't
 * have a CommandStep class, so we've had to infer the arguments from the code we could find and
 * the documentation on https://docs.liquibase.com/commands/rollback/rollback-one-update-sql.html.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackOneUpdateSqlCommand extends LiquibaseCommand {

    RollbackOneUpdateSqlCommand() {
        description = 'Write SQL to rollback one update from the database to <LiquibaseOutputFile or STDOUT if not specified (Liquibase Pro key required).'
        command = 'rollback-one-update-sql'
        legacyCommand = 'rollbackOneUpdateSql'
        commandArguments = [
                CHANGELOG_FILE,
                URL_ARG,
                USERNAME,
                PASSWORD,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                DEPLOYMENT_ID,
                FORCE
        ]
    }
}
