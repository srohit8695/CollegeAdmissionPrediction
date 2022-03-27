package com.example.college_admission_prediction.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    fun insertData(userEntity: UserEntity)


    @Query("Select * from userTable")
    fun showAllUser(): List<UserEntity>

}