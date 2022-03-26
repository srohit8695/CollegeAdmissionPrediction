package com.example.college_admission_prediction.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.college_admission_prediction.R
import com.example.college_admission_prediction.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var loginActivityBinding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginActivityBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginActivityBinding.root)



    }


}