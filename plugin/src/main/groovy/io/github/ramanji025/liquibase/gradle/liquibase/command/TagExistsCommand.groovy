package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the tag-exists command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class TagExistsCommand extends LiquibaseCommand {

    TagExistsCommand() {
        description = 'Verify the existence of the <liquibaseCommandValue> tag.'
        command = 'tag-exists'
        legacyCommand = 'tagExists'
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
