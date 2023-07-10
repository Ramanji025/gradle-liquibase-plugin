package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the mark-next-changeset-ran-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class MarkNextChangeSetRanSqlCommand extends LiquibaseCommand {


    MarkNextChangeSetRanSqlCommand() {
        description = 'Write SQL to mark the next change you apply as executed in the database to <liquibaseOutputFile>, or STDOUT if no value is provided.'
        command = 'mark-next-changeset-ran-sql'
        legacyCommand = 'markNextChangeSetRanSql'
        commandArguments = [
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                CHANGELOG_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
