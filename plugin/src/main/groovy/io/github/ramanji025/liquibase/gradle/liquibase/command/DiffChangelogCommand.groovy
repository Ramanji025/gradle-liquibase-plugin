package io.github.ramanji025.liquibase.gradle.liquibase.command

import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the diff-changelog command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class DiffChangelogCommand extends LiquibaseCommand {

    DiffChangelogCommand() {
        description = 'Compare two databases to produce changesets and write them to a changelog file'
        command = 'diff-changelog'
        legacyCommand = 'diffChangeLog'
        commandArguments = [
                REFERENCE_USERNAME,
                REFERENCE_PASSWORD,
                REFERENCE_URL,
                REFERENCE_DEFAULT_CATALOG_NAME,
                REFERENCE_DEFAULT_SCHEMA_NAME,
                USERNAME,
                PASSWORD,
                URL_ARG,
                DEFAULT_CATALOG_NAME,
                DEFAULT_SCHEMA_NAME,
                CHANGELOG_FILE,
                EXCLUDE_OBJECTS,
                INCLUDE_OBJECTS,
                INCLUDE_TABLESPACE,
                SCHEMAS,
                INCLUDE_SCHEMA,
                INCLUDE_CATALOG,
                DIFF_TYPES,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }

}
