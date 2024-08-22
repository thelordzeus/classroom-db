import kotlinx.serialization.Serializable

@Serializable
data class Class(
    val id: Int, // Integer id
    val standard: String,
    val section: String,
    val roomNumber: Int,
    val createdAt: String
)
