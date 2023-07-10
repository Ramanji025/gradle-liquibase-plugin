package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the unexpected-changesets command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UnexpectedChangeSetsCommand extends LiquibaseCommand {

    UnexpectedChangeSetsCommand() {
        description = 'Generate a list of changesets that have been executed but are not in the current changelog.'
        command = 'unexpected-changesets'
        legacyCommand = 'unexpectedChangeSets'
        commandArguments = [
                URL_ARG,
                DEFAULT_CATALOG_NAME,
                DEFAULT_SCHEMA_NAME,
                USERNAME,
                PASSWORD,
                CHANGELOG_FILE,
                CONTEXTS,
                VERBOSE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }

}
