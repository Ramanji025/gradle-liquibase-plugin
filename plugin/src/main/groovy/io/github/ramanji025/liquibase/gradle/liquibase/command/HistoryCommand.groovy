package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the history command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class HistoryCommand extends LiquibaseCommand {

    HistoryCommand() {
        description =  'List all deployed changesets and their deployment IDs to <liquibaseOutputFile> or STDOUT if no file is provided.'
        command =  'history'
        legacyCommand =  'history'
        commandArguments =  [
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
