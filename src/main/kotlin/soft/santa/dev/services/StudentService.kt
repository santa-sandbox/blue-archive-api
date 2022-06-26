package soft.santa.dev.services

import soft.santa.dev.models.Student
import soft.santa.dev.repo.StudentRepository

interface StudentService {
    suspend fun findAll(): List<Student>
}

class StudentServiceImpl(private val studentRepository: StudentRepository) : StudentService {
    override suspend fun findAll(): List<Student> = studentRepository.findAll()
}
