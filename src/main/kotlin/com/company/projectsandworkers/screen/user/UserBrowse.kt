package com.company.projectsandworkers.screen.user

import com.company.projectsandworkers.entity.User
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.*

@UiController("User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@Route("users")
open class UserBrowse : StandardLookup<User>()