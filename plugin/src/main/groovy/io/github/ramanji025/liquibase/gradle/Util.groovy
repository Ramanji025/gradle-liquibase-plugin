package io.github.ramanji025.liquibase.gradle

/**
 * Utility class to hold our helper methods.
 *
 * @author Ramanjaneyulu Pathuri
 */
class Util {

    static def versionAtLeast(String givenSemver, String targetSemver) {
        List givenVersions = givenSemver.tokenize('.')
        List targetVersions = targetSemver.tokenize('.')

        def commonIndices = Math.min(givenVersions.size(), targetVersions.size())

        for ( int i = 0; i < commonIndices; ++i ) {
            def givenNum = givenVersions[i].toInteger()
            def targetNum = targetVersions[i].toInteger()

            if ( givenNum != targetNum ) {
                return givenNum > targetNum
            }
        }

        // If we got this far then all the common indices are identical, so whichever version is
        // longer must be more recent
        return givenVersions.size() > targetVersions.size()
    }

}
