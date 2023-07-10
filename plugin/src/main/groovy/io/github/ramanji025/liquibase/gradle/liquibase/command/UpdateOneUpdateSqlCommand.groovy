package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the update-one-update-sql command.  This Liquibase Pro command doesn't
 * have a CommandStep class, so we've had to infer the arguments from the code we could find and
 * the documentation on https://docs.liquibase.com/commands/update/update-one-update-sql.html.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UpdateOneUpdateSqlCommand extends LiquibaseCommand {

    UpdateOneUpdateSqlCommand() {
        description = 'Output the SQL to deploy any specific changeset in your changelog to your database. It is only available for Liquibase Pro users'
        command = 'update-one-changeset-sql'
        legacyCommand = 'updateOneChangesetSql'
        requiresValue = true
        valueArgument = CHANGESET_ID
        commandArguments = [
                CHANGESET_ID,
                CHANGELOG_FILE,
                URL_ARG,
                USERNAME,
                PASSWORD,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
