package com.example.microsiase.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Topics")
data class Topic(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "topic_name") var topicName: String?,
    @ColumnInfo(name = "id_topic_dependency") var IdTopicDependency: String?,
    @ColumnInfo(name = "semester") var semester: Int?,
    @ColumnInfo(name = "description") var description: String?
)
/* Id INT NOT NULL AUTO_INCREMENT,
  TopicName VARCHAR(150),
  IdTopicDependency INT DEFAULT 0,
  Semester INT NOT NULL,
  Description VARCHAR(255) DEFAULT 'No Description Provided',
  PRIMARY KEY (Id)*/