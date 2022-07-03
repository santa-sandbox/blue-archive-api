package dev.santa.soft.plugins

import dev.santa.soft.routes.appInfoRoute
import dev.santa.soft.routes.checkHealthRoute
import dev.santa.soft.routes.findStudentRoute
import dev.santa.soft.routes.listStudentRoute
import io.ktor.server.application.Application
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        checkHealthRoute()
        appInfoRoute()
        listStudentRoute()
        findStudentRoute()
    }
}
