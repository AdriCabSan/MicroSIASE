package com.example.microsiase.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "group_schedule")
data class GroupSchedule(
    @PrimaryKey(autoGenerate = true) var id: Int,
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