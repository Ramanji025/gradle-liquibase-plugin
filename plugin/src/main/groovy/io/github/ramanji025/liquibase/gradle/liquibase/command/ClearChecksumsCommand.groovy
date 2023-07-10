package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the clear-checksums command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ClearChecksumsCommand extends LiquibaseCommand {


    ClearChecksumsCommand() {
        description = 'Remove all saved checksums from the database. On next run checksums will be recomputed.  Useful for "MD5Sum Check Failed" errors.'
        command = 'clear-checksums'
        legacyCommand = 'clearChecksums'
        commandArguments = [
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
