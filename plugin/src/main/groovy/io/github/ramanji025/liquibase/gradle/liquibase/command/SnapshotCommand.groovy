package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the snapshot command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class SnapshotCommand extends LiquibaseCommand {

    SnapshotCommand() {
        description =  'Capture the current state of the database.'
        command =  'snapshot'
        legacyCommand =  'snapshot'
        commandArguments = [
                USERNAME,
                PASSWORD,
                URL_ARG,
                SCHEMAS,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                SNAPSHOT_FORMAT,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }

}
