package com.bpcs.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.bpcs.gradle.task.StatusTask

/**
 * Gradle plugin to perform Git tasks
 */
class GitPlugin implements Plugin<Project>
{


    void apply(Project project)
    {
        project.extensions.create("gitprops", GitPluginProperties)
        project.task(StatusTask.NAME, type: StatusTask)

    }
}
