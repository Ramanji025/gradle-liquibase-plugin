package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the snapshot-reference command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class SnapshotReferenceCommand extends LiquibaseCommand {

    SnapshotReferenceCommand() {
        description: 'Capture the current state of the reference database.'
        command = 'snapshot-reference'
        legacyCommand = 'snapshotReference'
        commandArguments = [
                REFERENCE_USERNAME,
                REFERENCE_PASSWORD,
                REFERENCE_URL,
                REFERENCE_DEFAULT_SCHEMA_NAME,
                REFERENCE_DEFAULT_CATALOG_NAME,
                SNAPSHOT_FORMAT,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
