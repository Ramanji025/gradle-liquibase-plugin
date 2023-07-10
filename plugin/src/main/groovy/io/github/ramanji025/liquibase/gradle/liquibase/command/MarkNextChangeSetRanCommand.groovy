package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the mark-next-changeset-ran command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class MarkNextChangeSetRanCommand extends LiquibaseCommand {

    MarkNextChangeSetRanCommand() {
        description = 'Mark the next change you apply as executed in the database.'
        command = 'mark-next-changeset-ran'
        legacyCommand = 'markNextChangeSetRan'
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
