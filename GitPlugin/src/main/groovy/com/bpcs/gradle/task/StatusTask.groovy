package com.bpcs.gradle.task

import org.ajoberstar.grgit.Grgit
import org.ajoberstar.grgit.Status
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskAction

/**
 * Implements the Git status task
 */
class StatusTask extends Exec
{
    static final String NAME = "status"

    @TaskAction
    void getStatus ()
    {
        if (project.gitprops.localGitRepo)
        {
            String localRepo = project.gitprops.localGitRepo
            Grgit grgit = Grgit.open(dir: localRepo)
            def status = grgit.status()
            println status

        }
    }

    StatusTask()
    {
        group 'git'
    }
}
