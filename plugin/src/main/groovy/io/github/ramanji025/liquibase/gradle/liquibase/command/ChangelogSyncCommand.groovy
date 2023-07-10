package io.github.ramanji025.liquibase.gradle.liquibase.command

import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the changelog-sync command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ChangelogSyncCommand extends LiquibaseCommand {

    ChangelogSyncCommand() {
        description =  'Mark all changes as executed in the database.'
        command =  'changelog-sync'
        legacyCommand = 'changelogSync'
        commandArguments = [
                CHANGELOG_FILE,
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                LABEL_FILTER,
                LABELS,
                CONTEXTS,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
