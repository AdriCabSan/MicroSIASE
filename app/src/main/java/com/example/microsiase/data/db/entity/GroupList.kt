package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
    (
    tableName = "GroupLists",
    foreignKeys = arrayOf(
        ForeignKey
            (
            entity = Group::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id_group"),
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey
            (
            entity = SystemUser::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id_student"),
            onDelete = ForeignKey.CASCADE
        )
    ))
data class GroupList(
    @PrimaryKey
    @ColumnInfo(name = "id_student") var idStudent: Int,
    @PrimaryKey
    @ColumnInfo(name = "id_group") var idGroup: Int
/*IdGroup INT NOT NULL,
  IdStudent INT NOT NULL,
  PRIMARY KEY (IdGroup, IdStudent),
  FOREIGN KEY (idGroup) REFERENCES Groups(Id),
  FOREIGN KEY (IdStudent) REFERENCES SystemUser(Id)*/
)