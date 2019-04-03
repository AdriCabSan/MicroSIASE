package com.example.microsiase.data.db.entity.compoundEntities

import androidx.room.Embedded
import com.example.microsiase.data.db.entity.Group
import com.example.microsiase.data.db.entity.StudentSchedule

data class SystemStudent(
var id: Int,
var semester: Int,
var group: Int,
var grade: Int,
var opportunity: Int
)
//Use id, semester, group, grade, and opportunity
