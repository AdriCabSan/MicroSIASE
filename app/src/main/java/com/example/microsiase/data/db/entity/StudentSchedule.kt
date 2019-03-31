package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
    (
    tableName = "StudentSchedule",
    foreignKeys = arrayOf(
        ForeignKey
            (
            entity = Group::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id_group")
            // onDelete = ForeignKey.CASCADE
        )
    ))
data class StudentSchedule(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "semester") var semester: Int,
    @ColumnInfo(name = "id_group") var idGroup: Int,
    @ColumnInfo(name = "grade") var grade: Int?,
    @ColumnInfo(name = "opportunity") var opportunity: Int?,
    @ColumnInfo(name = "unit_status") var unitStatus: Int?
    )

/*IdStudent INT NOT NULL,
Semester TINYINT NOT NULL,
IdGroup INT NOT NULL,
Grade TINYINT,
Opportunity TINYINT DEFAULT 1,
UnitStatus TINYINT DEFAULT 1,
PRIMARY KEY (IdStudent),
FOREIGN KEY (IdGroup) REFERENCES Groups(Id)*/