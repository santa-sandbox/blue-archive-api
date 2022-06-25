package soft.santa.dev.dto

@kotlinx.serialization.Serializable
data class StudentDto(
    val id: String? = null,
    val name: String
)
