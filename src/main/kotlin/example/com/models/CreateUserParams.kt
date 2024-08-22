import kotlinx.serialization.Serializable

@Serializable
data class CreateUserParams(
    val fullName: String,
    val email: String,
    val password: String
)
