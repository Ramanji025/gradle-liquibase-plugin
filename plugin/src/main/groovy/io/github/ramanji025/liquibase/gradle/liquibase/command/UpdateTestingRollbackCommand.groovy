package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the update-testing-rollback command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class UpdateTestingRollbackCommand extends LiquibaseCommand {

    UpdateTestingRollbackCommand() {
        description = 'Updates database, then rolls back changes before updating again. Useful for testing rollback support.'
        command = 'update-testing-rollback'
        legacyCommand = 'updateTestingRollback'
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
                CHANGE_EXEC_LISTENER_CLASS,
                CHANGE_EXEC_LISTENER_PROPERTIES_FILE,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
