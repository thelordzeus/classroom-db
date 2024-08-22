import kotlinx.serialization.Serializable

@Serializable
data class CreateClassParams(
    val standard: String,
    val section: String,
    val roomNumber: Int,
    val userIds: List<Int> // List of user IDs to be assigned to the class
)
