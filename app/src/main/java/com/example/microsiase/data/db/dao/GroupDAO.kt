package com.example.microsiase.data.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.microsiase.data.db.entity.Group

@Dao
interface GroupDAO {
    @Query(
        "SELECT * FROM book " +
                "INNER JOIN loan ON loan.book_id = book.id " +
                "INNER JOIN user ON user.id = loan.user_id " +
                "WHERE user.name LIKE :userName"
    )
    fun findStudentsByGroup(userName: String): List<Group>
}