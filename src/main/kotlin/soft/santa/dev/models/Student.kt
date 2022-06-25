package soft.santa.dev.models

import org.bson.codecs.pojo.annotations.BsonId
import org.litote.kmongo.Id

data class Student(
    @BsonId
    val id: Id<Student>? = null,
    val name: String
)
