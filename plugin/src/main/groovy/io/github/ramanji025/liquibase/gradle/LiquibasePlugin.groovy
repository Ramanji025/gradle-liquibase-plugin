package io.github.ramanji025.liquibase.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin
import io.github.ramanji025.liquibase.gradle.liquibase.command.*

class LiquibasePlugin implements Plugin<Project> {

    public static final String LIQUIBASE_RUNTIME_CONFIGURATION = "liquibaseRuntime"

    void apply(Project project) {
        applyExtension(project)
        applyConfiguration(project)
        applyTasks(project)
    }


    void applyExtension(Project project) {
        def activities = project.container(Activity) { name ->
            new Activity(name)
        }
        project.configure(project) {
            extensions.create("liquibase", LiquibaseExtension, activities)
        }
    }

    void applyConfiguration(Project project) {
        project.configure(project) {
            configurations.maybeCreate(LIQUIBASE_RUNTIME_CONFIGURATION)
        }
    }

    /**
     * Create all of the liquibase tasks and add them to the project.  If the liquibaseTaskPrefix
     * is set, add that prefix to the task names.
     * @param project the project to enhance
     */
    void applyTasks(Project project) {
        // Create the tasks from an array of LiquibaseCommand objects.
        [
                new CalculateChecksumCommand(),
                new ChangelogSyncCommand(),
                new ChangelogSyncSqlCommand(),
                new ChangelogSyncToTagCommand(),
                new ChangelogSyncToTagSqlCommand(),
                new ChecksCommand(),
                new ClearChecksumsCommand(),
                new DbDocCommand(),
                new DeactivateChangelogCommand(),
                new DiffCommand(),
                new DiffChangelogCommand(),
                new DropAllCommand(),
                new ExecuteSqlCommand(),
                new ExecuteSqlFileCommand(),
                new FutureRollbackCountSqlCommand(),
                new FutureRollbackFromTagSqlCommand(),
                new FutureRollbackSqlCommand(),
                new GenerateChangelogCommand(),
                new HistoryCommand(),
                new ListLocksCommand(),
                new MarkNextChangeSetRanCommand(),
                new MarkNextChangeSetRanSqlCommand(),
                new RegisterChangelogCommand(),
                new ReleaseLocksCommand(),
                new RollbackCommand(),
                new RollbackCountCommand(),
                new RollbackCountSqlCommand(),
                new RollbackOneChangeSetCommand(),
                new RollbackOneChangeSetSqlCommand(),
                new RollbackOneUpdateCommand(),
                new RollbackOneUpdateSqlCommand(),
                new RollbackSqlCommand(),
                new RollbackToDateCommand(),
                new RollbackToDateSqlCommand(),
                new SnapshotCommand(),
                new SnapshotReferenceCommand(),
                new StatusCommand(),
                new SyncHubCommand(),
                new TagCommand(),
                new TagExistsCommand(),
                new UnexpectedChangeSetsCommand(),
                new UpdateCommand(),
                new UpdateCountCommand(),
                new UpdateCountSqlCommand(),
                new UpdateOneChangeSetCommand(),
                new UpdateOneUpdateSqlCommand(),
                new UpdateSqlCommand(),
                new UpdateTestingRollbackCommand(),
                new UpdateToTagCommand(),
                new UpdateToTagSqlCommand(),
                new ValidateCommand()
        ].each { lbCommand ->
            // The default task name is the liquibase command, converted from kebab-case to
            // camelCase.
            def taskName = lbCommand.command.replaceAll("(-)([A-Za-z0-9])", { Object[] it -> it[2].toUpperCase() })

            // If the command has a legacy command from the pre 4.4 days, and the user has defined
            // the liquibaseCreateLegacyTasks property, then the task name should match the old
            // legacy name instead of the new one.
            if ( project.hasProperty('liquibaseCreateLegacyTasks') && lbCommand.legacyCommand ) {
                taskName = lbCommand.legacyCommand
            }

            // Fix the task name if we have a task prefix.
            if ( project.hasProperty('liquibaseTaskPrefix') ) {
                taskName = project.liquibaseTaskPrefix + taskName.capitalize()
            }
            project.tasks.register(taskName, LiquibaseTask) {
                group = 'Liquibase'
                description = lbCommand.description
                liquibaseCommand = lbCommand
            }
        }
    }
}
