package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "StatusUser")
data class StatusUser(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "status_desc") var statusDescription: String
)