package com.example.microsiase.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.microsiase.data.db.dao.StudentDAO
import com.example.microsiase.data.db.dao.TopicDAO
import com.example.microsiase.data.db.entity.*

@Database(
    entities = arrayOf(
        Group::class,GroupList::class,GroupSchedule::class,
        StatusUser::class,SystemUser::class,TypeUser::class,
        Topic::class,StudentSchedule::class,StatusUnit::class
),
    version = 1
)
abstract class MicroSiaseDB : RoomDatabase() {

//declare all daos here
abstract fun studentDao(): StudentDAO
abstract fun TopicDao() : TopicDAO
    //SINGLETON
    companion object : SingletonHolder<MicroSiaseDB, Context>({
        Room.databaseBuilder(it, MicroSiaseDB::class.java, "microsiase.db").build()
    })
}

