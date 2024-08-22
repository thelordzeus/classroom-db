import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val fullName: String,
    val email: String,
    val password: String,
    val classId: Int? = null,
    val createdAt: String,
    val updatedAt: String? = null
)
