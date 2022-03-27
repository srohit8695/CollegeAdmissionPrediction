package com.example.college_admission_prediction.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase



@Database(entities = [UserEntity::class], version = 1)
@TypeConverters
abstract class UserDB : RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object{

        private var instance : UserDB ? = null

        fun getInstance(context: Context) : UserDB?{
            if(instance == null){
                synchronized(UserDB::class){
                    instance = Room.databaseBuilder(context.applicationContext, UserDB::class.java, "user.db")
                        .allowMainThreadQueries().build()
                }
            }
            return instance
        }

    }

}