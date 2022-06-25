package soft.santa.dev.services

import com.typesafe.config.ConfigFactory
import io.ktor.server.config.HoconApplicationConfig
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import soft.santa.dev.models.Student

class StudentService {
    private val mongoUri = HoconApplicationConfig(ConfigFactory.load()).property("mongo.uri").getString()
    private val client = KMongo.createClient(mongoUri).coroutine
    private val database = client.getDatabase("blue_archive")
    private val studentCollection = database.getCollection<Student>("students")

    suspend fun findAll(): List<Student> = studentCollection.find().toList()
}
