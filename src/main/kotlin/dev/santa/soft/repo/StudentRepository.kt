package dev.santa.soft.repo

import dev.santa.soft.models.Student
import org.bson.Document
import org.litote.kmongo.coroutine.CoroutineClient
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.CoroutineDatabase

class StudentRepository(client: CoroutineClient) {
    private val database: CoroutineDatabase
    private val collection: CoroutineCollection<Student>

    init {
        database = client.getDatabase("blue_archive")
        collection = database.getCollection("students")
    }

    suspend fun findAll(): List<Student> = collection.find().toList()

    suspend fun deleteAll(): Long = collection.deleteMany(Document()).deletedCount
}
