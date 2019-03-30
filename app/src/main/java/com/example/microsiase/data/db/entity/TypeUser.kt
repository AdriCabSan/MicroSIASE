package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "TypeUser")
data class TypeUser(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "type_desc") var typeDescription: String?
)