package soft.santa.dev.services

import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import soft.santa.dev.models.Student

class StudentService {
    private val client = KMongo.createClient().coroutine
    private val database = client.getDatabase("students")
    private val studentCollection = database.getCollection<Student>()

    suspend fun findAll(): List<Student> = studentCollection.find().toList()
}
