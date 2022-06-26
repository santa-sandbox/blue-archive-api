package soft.santa.dev.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import org.koin.ktor.ext.inject
import soft.santa.dev.extensions.toDto
import soft.santa.dev.models.Student
import soft.santa.dev.services.StudentService

fun Application.configureRouting() {
    val studentService: StudentService by inject()

    routing {
        get("/health") {
            call.respondText("OK")
        }
        get("/students") {
            val studentList = studentService.findAll().map(Student::toDto)

            call.respond(studentList)
        }
    }
}
