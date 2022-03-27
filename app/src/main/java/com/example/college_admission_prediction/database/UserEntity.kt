package com.example.college_admission_prediction.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userTable")
data class UserEntity(
    val email : String,
    @PrimaryKey(autoGenerate = true) val id: Int?= null
)
