
package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the generate-changelog command.  Unlike most commands that take database
 * arguments, this command doesn't take default-schema-name or default-catalog-name.
 *
 * @author Ramanjaneyulu Pathuri
 */
class GenerateChangelogCommand extends LiquibaseCommand {

    GenerateChangelogCommand() {
        description =  'Generate a Groovv changelog from the current state of the database to <LiquibaseOutputFile> or STDOUT of no file is specified.'
        command =  'generate-changelog'
        legacyCommand =  'generateChangelog'
        commandArguments = [
                USERNAME,
                PASSWORD,
                URL_ARG,
                CHANGELOG_FILE,
                DATA_OUTPUT_DIRECTORY,
                EXCLUDE_OBJECTS,
                INCLUDE_OBJECTS,
                INCLUDE_SCHEMA,
                INCLUDE_CATALOG,
                INCLUDE_TABLESPACE,
                SCHEMAS,
                DIFF_TYPES,
                DRIVER,
                DRIVER_PROPERTIES_FILE,
                OVERWRITE_OUTPUT_FILE,
        ]
    }
}
