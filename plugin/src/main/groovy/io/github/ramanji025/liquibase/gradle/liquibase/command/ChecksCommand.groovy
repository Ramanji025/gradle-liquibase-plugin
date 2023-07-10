package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the checks command.  This command requires a value, but unlike most
 * commands that require a value, this command doesn't have a {@code valueArgument}.  We just send
 * the "liquibaseCommandValue" value as a positional value at the end of the command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class ChecksCommand extends LiquibaseCommand {

    ChecksCommand() {
        description =  'Execute the <liquibaseCommandValue> quality check'
        command =  'checks'
        legacyCommand =  'checks'
        requiresValue =  true
        commandArguments =  [
                AUTO_UPDATE,
                CHECKS_SETTINGS_FILE,
                CHECK_NAME,
                CHANGELOG_FILE,
                FORMAT
        ]
    }
}
