package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the changelog-sync-sql command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ChangelogSyncSqlCommand extends LiquibaseCommand {

    ChangelogSyncSqlCommand() {
        description = 'Output the raw SQL Liquibase would use when running changelogSync to the <liquibaseOutputFile> or STDOUT if no file is specified.'
        command = 'changelog-sync-sql'
        legacyCommand = 'changelogSyncSql'
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
                DRIVER_PROPERTIES_FILE,
                OUTPUT_DEFAULT_SCHEMA,
                OUTPUT_DEFAULT_CATALOG
        ]
    }

}
