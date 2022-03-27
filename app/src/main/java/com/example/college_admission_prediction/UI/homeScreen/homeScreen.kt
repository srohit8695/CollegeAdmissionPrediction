package com.example.college_admission_prediction.UI.homeScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.college_admission_prediction.R
import com.example.college_admission_prediction.databinding.ActivityHomeScreenBinding
import com.example.college_admission_prediction.databinding.ActivityLoginBinding

class homeScreen : AppCompatActivity() {

    private lateinit var activityHomeScreenBinding: ActivityHomeScreenBinding
    private lateinit var homeScreenViewModel: HomeScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityHomeScreenBinding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(activityHomeScreenBinding.root)

        homeScreenViewModel = ViewModelProvider(this).get(HomeScreenViewModel::class.java)



    }



}