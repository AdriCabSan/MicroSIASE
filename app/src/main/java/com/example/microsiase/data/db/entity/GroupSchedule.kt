package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
@Entity
    (
    tableName = "GroupSchedule",
    foreignKeys = arrayOf(
        ForeignKey
            (
            entity = Group::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("id")
            // onDelete = ForeignKey.CASCADE
        )
    ))
data class GroupSchedule(
    @PrimaryKey var id: Int,
    @PrimaryKey
    @ColumnInfo(name = "room") var room: String,
    @ColumnInfo(name = "starting_hour") var startingHour: String,
    @ColumnInfo(name = "ending_hour") var endingHour: String,
    @ColumnInfo(name = "monday") var monday: Int,
    @ColumnInfo(name = "tuesday") var tuesday : Int,
    @ColumnInfo(name = "wednesday") var wednesday: Int,
    @ColumnInfo(name = "thursday") var thursday: Int,
    @ColumnInfo(name = "friday") var friday: Int,
    @ColumnInfo(name = "saturday") var saturday: Int

    /*Id INT NOT NULL,
  Room SMALLINT NOT NULL,
  HourStart TIME NOT NULL,
  HourEnd TIME NOT NULL,
  D1 TINYINT DEFAULT 0,
  D2 TINYINT DEFAULT 0,
  D3 TINYINT DEFAULT 0,
  D4 TINYINT DEFAULT 0,
  D5 TINYINT DEFAULT 0,
  D6 TINYINT DEFAULT 0,
  PRIMARY KEY (Id, Room),
  FOREIGN KEY (Id) REFERENCES Group(Id)*/
)