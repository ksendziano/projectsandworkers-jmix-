package com.company.projectsandworkers.screen.project

import com.company.projectsandworkers.entity.Project
import com.company.projectsandworkers.entity.Worker
import io.jmix.ui.UiComponents
import io.jmix.ui.component.CheckBox
import io.jmix.ui.component.Component
import io.jmix.ui.component.DataGrid
import io.jmix.ui.screen.*
import org.springframework.beans.factory.annotation.Autowired


/**
 *
 * @author Ilya Ksendzovskiy
 */
@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
class ProjectEdit : StandardEditor<Project>() {
    @Autowired
    private lateinit var uiComponents: UiComponents

    @Install(to = "workersTable.involved", subject = "columnGenerator")
    private fun workersTableInvolvedColumnGenerator(columnGeneratorEvent: DataGrid.ColumnGeneratorEvent<Worker>): Component {
        val checkBoxInvolved = uiComponents.create(CheckBox::class.java)
        val worker = columnGeneratorEvent.item
        val workers = editedEntity.workers
        checkBoxInvolved.value = workers.contains(worker)
        checkBoxInvolved.addValueChangeListener {
            if (workers.contains(worker)) {
                workers.remove(worker)
            } else {
                workers.add(worker)
            }
        }
        return checkBoxInvolved
    }
}