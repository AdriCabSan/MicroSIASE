package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
    (
    tableName = "Group",
    foreignKeys = arrayOf(
    ForeignKey
    (
    entity = SystemUser::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("ownerId")
   // onDelete = ForeignKey.CASCADE
    )
))
data class Group(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "room") var room: Int,
    @ColumnInfo(name = "id_topic") var idTopic: Int,
    @ColumnInfo(name = "max_student_number") var maxStudentNumber: Int,
    @ColumnInfo(name = "description") var description: String?
    /*Id INT NOT NULL AUTO_INCREMENT,
    Room SMALLINT NOT NULL,
    IdTopic INT NOT NULL,
    IdTeacher INT NOT NULL,
    NMaxStudents SMALLINT NOT NULL,

    PRIMARY KEY (Id, Room),
FOREIGN KEY (IdTeacher) REFERENCES SystemUser(Id)*/
)