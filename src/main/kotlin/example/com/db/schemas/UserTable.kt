package example.com.db.schemas

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.javatime.datetime
import java.time.LocalDateTime
import org.jetbrains.exposed.sql.ReferenceOption

object UserTable : IntIdTable("users") {
    val fullName = varchar("full_name", 50)
    val email = varchar("email", 50)
    val password = varchar("password", 64)
    val classId = reference("class_id", ClassTable.id, onDelete = ReferenceOption.SET_NULL).nullable()
    val createdAt = datetime("created_at").clientDefault { LocalDateTime.now() }
    val updatedAt = datetime("updated_at").nullable()
}