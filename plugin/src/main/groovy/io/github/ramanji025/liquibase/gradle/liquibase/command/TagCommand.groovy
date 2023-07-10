package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the tag command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class TagCommand extends LiquibaseCommand {

    TagCommand() {
        description = 'Mark the current database state with the <liquibaseCommandValue> tag.'
        command = 'tag'
        legacyCommand = 'tag'
        requiresValue = true
        valueArgument = TAG
        commandArguments = [
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                TAG,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
