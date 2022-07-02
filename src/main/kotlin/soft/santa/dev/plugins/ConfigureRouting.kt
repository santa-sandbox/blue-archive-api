package soft.santa.dev.plugins

import io.ktor.server.application.Application
import io.ktor.server.routing.routing
import soft.santa.dev.routes.appInfoRoute
import soft.santa.dev.routes.checkHealthRoute
import soft.santa.dev.routes.findStudentRoute
import soft.santa.dev.routes.listStudentRoute

fun Application.configureRouting() {
    routing {
        checkHealthRoute()
        appInfoRoute()
        listStudentRoute()
        findStudentRoute()
    }
}
