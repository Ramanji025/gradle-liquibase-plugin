package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the db-doc command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class DbDocCommand extends LiquibaseCommand {

    DbDocCommand() {
        description = 'Generates Javadoc-like documentation for the existing database and changelogs to the <liquibaseCommandValue> directory.'
        command = 'db-doc'
        legacyCommand = 'dbDoc'
        requiresValue = true
        valueArgument = OUTPUT_DIRECTORY
        commandArguments = [
                CHANGELOG_FILE,
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                OUTPUT_DIRECTORY,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
