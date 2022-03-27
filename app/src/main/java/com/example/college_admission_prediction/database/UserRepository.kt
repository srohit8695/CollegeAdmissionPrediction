package com.example.college_admission_prediction.database

import android.content.Context

class UserRepository(context: Context) {

    var dbms : UserDao = UserDB.getInstance(context)?.userDao()!!

    fun insertData(userEntity: UserEntity) {
         dbms.insertData(userEntity)
    }

}