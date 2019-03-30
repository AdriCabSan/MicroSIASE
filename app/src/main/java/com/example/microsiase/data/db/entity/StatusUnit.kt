package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "StatusUnit")
data class StatusUnit(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "status_unit_desc") var statusUnitDescription: String?
)