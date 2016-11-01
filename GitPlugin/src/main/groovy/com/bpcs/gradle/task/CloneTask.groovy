package com.bpcs.gradle.task

import org.ajoberstar.grgit.Grgit
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Implements the Git status task
 */
class CloneTask extends DefaultTask
{
    static final String NAME = "clone"

    @TaskAction
    void getStatus ()
    {
        if (project.gitprops.localGitRepo)
        {
            String localRepo = project.gitprops.localGitRepo

        }
    }

    CloneTask()
    {
        group 'git'
    }
}
