package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the release-locks command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ReleaseLocksCommand extends LiquibaseCommand {

    ReleaseLocksCommand() {
        description = 'Remove the Liquibase lock record from the DATABASECHANGELOG table.'
        command = 'release-locks'
        legacyCommand = 'releaseLocks'
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
