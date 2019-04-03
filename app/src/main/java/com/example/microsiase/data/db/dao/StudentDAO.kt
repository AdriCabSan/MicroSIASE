package com.example.microsiase.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.microsiase.data.db.entity.Group
import com.example.microsiase.data.db.entity.SystemUser
/**
 * Queries used when {@link SystemUser} is an student.
 * <p>
 * When The value of {@link SystemUser}.user_type = 'Student'.
 * Insert & Update must have a validated SytemUser where user_type='Student'
 * <p>*/
@Dao
interface StudentDAO {
    @Query(
        "select * from GroupList Inner Join SystemUser ON GroupList.id_student = SystemUser.id " +
                "WHERE SystemUser.user_type = 'Student' "
    )
    fun showStudentsByGroup(): List<SystemUser>

    @Query(
        "select * from GroupList Inner Join SystemUser ON GroupList.id_student = SystemUser.id " +
                "WHERE SystemUser.user_type = 'Student' LIMIT :studentsDisplayed "
    )
    fun showSelectedStudentsByGroup(studentsDisplayed: Int): List<SystemUser>


    @Query("SELECT * FROM SystemUser WHERE SystemUser.id = :studentId and SystemUser.user_type = 'Student'" )
    fun findStudentById(studentId: Int): SystemUser

    @Insert
    fun insertStudent(student: SystemUser)

    @Update
    fun updateStudent(student: SystemUser)

    @Query("DELETE FROM SystemUser WHERE SystemUser.id = :studentId and SystemUser.user_type = 'Student'" )
    fun deleteStudent(studentId: Int)


}