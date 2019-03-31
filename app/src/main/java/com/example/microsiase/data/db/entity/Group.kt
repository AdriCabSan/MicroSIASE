package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
    (
    tableName = "Groups",
    foreignKeys = arrayOf(
    ForeignKey
    (
    entity = SystemUser::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("id_teacher")
   // onDelete = ForeignKey.CASCADE
    )
))
data class Group(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @PrimaryKey
    @ColumnInfo(name = "room") var room: Int,
    @ColumnInfo(name = "id_topic") var idTopic: Int,
    @ColumnInfo(name = "id_teacher") var idTeacher: Int,
    @ColumnInfo(name = "max_student_number") var maxStudentNumber: Int
    /*Id INT NOT NULL AUTO_INCREMENT,
    Room SMALLINT NOT NULL,
    IdTopic INT NOT NULL,
    IdTeacher INT NOT NULL,
    NMaxStudents SMALLINT NOT NULL,
    PRIMARY KEY (Id, Room),
    FOREIGN KEY (IdTeacher) REFERENCES SystemUser(Id)*/
)