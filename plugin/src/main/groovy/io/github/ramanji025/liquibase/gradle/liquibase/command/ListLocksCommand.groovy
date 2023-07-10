package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the list-locks command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ListLocksCommand extends LiquibaseCommand {

    ListLocksCommand() {
        description = 'List the hostname, IP address, and timestamp of the Liquibase lock record.'
        command = 'list-locks'
        legacyCommand = 'listLocks'
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
