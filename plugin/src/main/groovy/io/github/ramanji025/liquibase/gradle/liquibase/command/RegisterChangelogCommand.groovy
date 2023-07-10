package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the register-changelog command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class RegisterChangelogCommand extends LiquibaseCommand {

    RegisterChangelogCommand() {
        description = 'Register the changelog with a Liquibase Hub project.'
        command = 'register-changelog'
        legacyCommand = 'registerChangeLog'
        commandArguments = [
                CHANGELOG_FILE,
                HUB_PROJECT_ID,
                HUB_PROJECT_NAME,
                REGISTERED_CHANGELOG_ID
        ]
    }

}
