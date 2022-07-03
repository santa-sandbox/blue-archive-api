package dev.santa.soft.services

import dev.santa.soft.models.Student
import dev.santa.soft.repo.StudentRepository

interface StudentService {
    suspend fun findAll(): List<Student>
    suspend fun findById(id: String): Student
}

class StudentServiceImpl(private val studentRepository: StudentRepository) : StudentService {
    override suspend fun findAll(): List<Student> = studentRepository.findAll()

    override suspend fun findById(id: String): Student =
        studentRepository.findAll()[0]
}
