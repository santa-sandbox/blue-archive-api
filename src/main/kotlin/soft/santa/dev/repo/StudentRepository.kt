package soft.santa.dev.repo

import org.litote.kmongo.coroutine.CoroutineClient
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.CoroutineDatabase
import soft.santa.dev.models.Student

class StudentRepository(client: CoroutineClient) {
    private val database: CoroutineDatabase
    private val collection: CoroutineCollection<Student>

    init {
        database = client.getDatabase("blue_archive")
        collection = database.getCollection("students")
    }

    suspend fun findAll(): List<Student> = collection.find().toList()
}
