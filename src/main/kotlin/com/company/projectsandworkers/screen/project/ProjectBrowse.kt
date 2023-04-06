package com.company.projectsandworkers.screen.project

import io.jmix.ui.screen.*
import com.company.projectsandworkers.entity.Project


/**

*

* @author Ilya Ksendzovskiy

*/
@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
class ProjectBrowse : StandardLookup<Project>()