package soft.santa.dev.dto

import kotlinx.serialization.Serializable

@Serializable
data class StudentDto(
    val id: String? = null,
    val name: String
)
