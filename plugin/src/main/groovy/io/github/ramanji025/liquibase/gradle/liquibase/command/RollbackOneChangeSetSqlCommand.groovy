package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the rollback-one-changeset-sql command.  This Liquibase Pro command doesn't
 * have a CommandStep class, so we've had to infer the arguments from the code we could find and
 * the documentation on https://docs.liquibase.com/commands/rollback/rollback-one-changeset-sql.html.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RollbackOneChangeSetSqlCommand extends LiquibaseCommand {

    RollbackOneChangeSetSqlCommand() {
        description = 'Write SQL to roll back a specific changeset to <liquibaseCommandValue> in the <LiquibaseOutputFile> file (or STDOUT if not specified), without rolling back changesets deployed before or afterwards. (Liquibase Pro key required)'
        command = 'rollback-one-changeset-sql'
        legacyCommand = 'rollbackOneChangeSetSql'
        commandArguments = [
                CHANGELOG_FILE,
                URL_ARG,
                USERNAME,
                PASSWORD,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                CHANGESET_ID,
                CHANGESET_AUTHOR,
                CHANGESET_PATH,
                FORCE,
                ROLLBACK_SCRIPT
        ]
    }
}
