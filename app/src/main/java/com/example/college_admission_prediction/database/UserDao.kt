package com.example.college_admission_prediction.database

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface UserDao {

    @Insert
    fun insertData(userEntity: UserEntity)

}