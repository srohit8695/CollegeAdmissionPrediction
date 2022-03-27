package com.example.college_admission_prediction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.college_admission_prediction.UI.Login.LoginActivity
import com.example.college_admission_prediction.UI.homeScreen.homeScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, homeScreen::class.java)
        startActivity(intent)

    }
}