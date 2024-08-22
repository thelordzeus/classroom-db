package example.com.db.schemas

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.javatime.datetime
import java.time.LocalDateTime

object ClassTable : IntIdTable("class") {

    val standard = varchar("standard", 50)
    val section = varchar("section", 50)
    val roomNumber = integer("room_number")
    val createdAt = datetime("created_at").clientDefault { LocalDateTime.now() }


}
