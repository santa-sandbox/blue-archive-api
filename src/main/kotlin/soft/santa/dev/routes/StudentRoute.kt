package soft.santa.dev.routes

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject
import soft.santa.dev.extensions.toDto
import soft.santa.dev.models.Student
import soft.santa.dev.services.StudentService

fun Route.listStudentRoute() {
    val studentService: StudentService by inject()

    get("/students") {
        val studentList = studentService.findAll().map(Student::toDto)

        call.respond(studentList)
    }
}