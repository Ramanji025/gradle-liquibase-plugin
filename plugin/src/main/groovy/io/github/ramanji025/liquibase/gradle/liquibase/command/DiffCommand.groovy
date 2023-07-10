package io.github.ramanji025.liquibase.gradle.liquibase.command

import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the diff command.  Unlike most commands that support Database arguments,
 * this command doesn't appear to support the default-schema or default-catalog arguments.
 *
 * @author Ramanjaneyulu Pathuri
 */
class DiffCommand extends LiquibaseCommand {

    DiffCommand() {
        description = 'Compare two databases and write differences to <liquibaseOutputFile> or STDOUT of no file is specified.'
        command = 'diff'
        legacyCommand = 'diff'
        commandArguments = [
                REFERENCE_USERNAME,
                REFERENCE_PASSWORD,
                REFERENCE_URL,
                USERNAME,
                PASSWORD,
                URL_ARG,
                EXCLUDE_OBJECTS,
                INCLUDE_OBJECTS,
                SCHEMAS,
                DIFF_TYPES,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
