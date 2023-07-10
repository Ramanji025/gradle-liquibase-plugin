package io.github.ramanji025.liquibase.gradle.liquibase.command


import io.github.ramanji025.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the deactivate-changelog command.
 *
 * @author Ramanjaneyulu Pathuri
 */
class DeactivateChangelogCommand extends LiquibaseCommand {

    DeactivateChangelogCommand() {
        description = 'Removes the changelogID from your changelog so it stops sending reports to Liquibase Hub.'
        command = 'deactivate-changelog'
        legacyCommand = 'deactivateChangeLog'
        commandArguments = CHANGELOG_FILE
    }
}
