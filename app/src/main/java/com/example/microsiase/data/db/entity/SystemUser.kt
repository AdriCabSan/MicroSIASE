package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
    (
    tableName = "SystemUser",
    foreignKeys = arrayOf(
        ForeignKey
            (
            entity = TypeUser::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("user_type")
            // onDelete = ForeignKey.CASCADE
        ),
        ForeignKey
            (
            entity = StatusUser::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("user_status")
            // onDelete = ForeignKey.CASCADE
        )
    ))
data class SystemUser(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "name") var firstName: String?,
    @ColumnInfo(name = "last_name") var lastName: String?,
    @ColumnInfo(name = "mother_last_name") var motherLastName: String?,
    @ColumnInfo(name = "password") var password: String?,
    @ColumnInfo(name = "user_type") var userType: Int,
    @ColumnInfo(name = "user_status") var userStatus: Int
/*
Id INT NOT NULL,/
Name VARCHAR(150),
LastName VARCHAR(150),
MotherLast VARCHAR(150),
Passw VARCHAR(255),
UsrType TINYINT NOT NULL,
UsrStatus TINYINT NOT NULL,
PRIMARY KEY (Id),
FOREIGN KEY (UsrType) REFERENCES TypeUsr(Id),
FOREIGN KEY (UsrStatus) REFERENCES StatusUsr(Id)*/
)