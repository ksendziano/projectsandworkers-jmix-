package com.company.projectsandworkers.screen.worker

import io.jmix.ui.screen.*
import com.company.projectsandworkers.entity.Worker


/**

*

* @author Ilya Ksendzovskiy

*/
@UiController("Worker.browse")
@UiDescriptor("worker-browse.xml")
@LookupComponent("workersTable")
class WorkerBrowse : StandardLookup<Worker>()