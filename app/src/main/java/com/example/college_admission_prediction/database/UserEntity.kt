package com.example.college_admission_prediction.database

import androidx.room.Entity

@Entity(tableName = "userTable")
data class UserEntity(
    val email : String
)
