package com.example.microsiase.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.microsiase.data.db.entity.SystemUser
import com.example.microsiase.data.db.entity.Topic

@Dao
interface TopicDAO {
    @Query("select * from Topic WHERE Topic.id= :topicId")
    fun showTopicById(topicId: Int): List<Topic>

    @Query("select * from Topic")
    fun showAllTopics(): List<Topic>

    @Query("select * from Topic limit :topicsDisplayed ")
    fun showSelectedTopics(topicsDisplayed: Int): List<Topic>

    @Insert
    fun addNewTopic(topic: Topic)

    @Update
    fun updateTopic(topic: Topic)

    @Query("DELETE FROM Topic WHERE Topic.id = :TopicId" )
    fun deleteTopic(TopicId: Int)


}