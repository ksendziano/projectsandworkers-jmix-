package com.company.projectsandworkers.screen.worker

import io.jmix.ui.screen.*
import com.company.projectsandworkers.entity.Worker


/**

*

* @author Ilya Ksendzovskiy

*/
@UiController("Worker.edit")
@UiDescriptor("worker-edit.xml")
@EditedEntityContainer("workerDc")
class WorkerEdit : StandardEditor<Worker>()