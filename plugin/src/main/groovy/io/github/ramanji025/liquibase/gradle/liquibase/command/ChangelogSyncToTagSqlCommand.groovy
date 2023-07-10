package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the changelog-sync-to-tag-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ChangelogSyncToTagSqlCommand extends LiquibaseCommand {

    ChangelogSyncToTagSqlCommand() {
        description = 'Output the raw SQL used by Liquibase when running changelogSyncToTag to <liquibaseOutputFile> or STDOUT if no file is specified.'
        command = 'changelog-sync-to-tag-sql'
        legacyCommand = 'changelogSyncToTagSql'
        requiresValue = true
        valueArgument = TAG
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
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }

}
