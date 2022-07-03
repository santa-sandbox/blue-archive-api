package dev.santa.soft.routes

import dev.santa.soft.extensions.toDto
import dev.santa.soft.models.Student
import dev.santa.soft.services.StudentService
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

const val studentEndpoint = "student"
fun Route.listStudentRoute() {
    val studentService: StudentService by inject()

    get("/students") {
        val studentList = studentService.findAll().map(Student::toDto)

        call.respond(studentList)
    }
}

fun Route.findStudentRoute() {
    val studentService: StudentService by inject()

    get("/$studentEndpoint/{studentId?}") {
        val id = call.parameters["studentId"] ?: return@get call.respondText(
            "Missing ID",
            status = HttpStatusCode.BadRequest
        )
        val student = studentService.findById(id)
        call.respond(student.toDto())
    }
}
