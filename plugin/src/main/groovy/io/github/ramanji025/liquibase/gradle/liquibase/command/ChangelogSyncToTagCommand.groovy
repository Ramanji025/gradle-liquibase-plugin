package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the changelog-sync-to-tag command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ChangelogSyncToTagCommand extends LiquibaseCommand {

    ChangelogSyncToTagCommand() {
        description =  'Mark all undeployed changesets up to and including the <liquibaseCommandValue> tag as executed in your database.'
        command =  'changelog-sync-to-tag'
        legacyCommand =  'changelogSyncToTag'
        requiresValue =  true
        valueArgument =  TAG
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
                TAG,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
