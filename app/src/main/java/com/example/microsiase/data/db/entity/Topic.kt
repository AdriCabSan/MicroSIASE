package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "topic")
data class Topic(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "topic_name") var topicName: String?,
    @ColumnInfo(name = "id_topic_dependency") var IdTopicDependency: String?,
    @ColumnInfo(name = "semester") var semester: Int?,
    @ColumnInfo(name = "description") var description: String?
)