package io.github.ramanji025.liquibase.gradle;

/**
 * This class represents a single activity that must be performed as part of a liquibase task.  It
 * is basically the intersection of changelogs and databases. Each named activity in the
 * {@code activities} closure of the {@code liquibase} block will create one of these objects.
 *
 * @author Ramanjaneyulu Pathuri
 */
class Activity {
    /** The name of the activity.  This translates to the name of the block inside "activities". */
    def name
    /** The arguments to pass with the command, such as username or password. */
    def arguments = [logLevel: 'info']
    /** Changelog parameters.  These are passed to Liquibase via "-D" options */
    def changeLogParameters = [:]

    Activity(String name) {
        this.name = name
    }

    /**
     * Define the ChangeLog parameters to use for this activity.  ChangeLog parameters are used by
     * Liquibase to perform token substitution on change sets.
     *
     * @param tokenMap the map of tokens and their values.
     */
    def changeLogParameters(tokenMap) {
        tokenMap.each {
            changeLogParameters[it.key] = it.value
        }
    }

    /**
     * Used to configure the Liquibase arguments.  The method name is assumed to be a valid
     * Liquibase argument.  Not worrying about validity here is one way we decouple from a
     * particular version of Liquibase.
     *
     * @param name the name of the Liquibase argument
     * @param args Technically an array, the first value will be taken as the value of the Liquibase
     * argument.
     */
    def methodMissing(String name, args) {
        arguments[name] = args? args[0]: null
    }

}
