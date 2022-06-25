package soft.santa.dev.extensions

import soft.santa.dev.dto.StudentDto
import soft.santa.dev.models.Student

fun Student.toDto(): StudentDto =
    StudentDto(
        id = this.id.toString(),
        name = this.name
    )

fun StudentDto.toStudent(): Student =
    Student(
        name = this.name
    )
