package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the calculate-checksum command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class CalculateChecksumCommand extends LiquibaseCommand {

    CalculateChecksumCommand() {
        description = 'Calculate and print a checksum for the <liquibaseCommandValue> changeset.'
        command = 'calculate-checksum'
        legacyCommand = 'calculateCheckSum'
        requiresValue = true
        valueArgument = CHANGESET_IDENTIFIER
        commandArguments = [
                CHANGELOG_FILE,
                CHANGESET_IDENTIFIER,
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
