package com.example.college_admission_prediction.UI.homeScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.college_admission_prediction.Others.UtilFun
import com.example.college_admission_prediction.R
import com.example.college_admission_prediction.databinding.ActivityHomeScreenBinding
import com.example.college_admission_prediction.databinding.ActivityLoginBinding

class homeScreen : AppCompatActivity() {

    private lateinit var activityHomeScreenBinding: ActivityHomeScreenBinding
    private lateinit var homeScreenViewModel: HomeScreenViewModel
    private var greScore : String = ""
    private var toeflScore : String = ""
    private var sop : String = ""
    private var lor : String = ""
    private var cgpa : String = ""
    private var research : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityHomeScreenBinding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(activityHomeScreenBinding.root)

        homeScreenViewModel = ViewModelProvider(this).get(HomeScreenViewModel::class.java)

        activityHomeScreenBinding.searchCountry.setOnClickListener {

            if (UtilFun.checkForInternet(this)) {
                if(homeScreenViewModel.checkCountry(activityHomeScreenBinding)){
                    //API call
                }
                else{
                    UtilFun.showShortToast(this, "Enter Country Name")
                }
            } else {
                UtilFun.showShortToast(this, "Check Internet Connectivity")
            }

        }

        activityHomeScreenBinding.submit.setOnClickListener {

            greScore = activityHomeScreenBinding.greScore.text.toString()
            toeflScore = activityHomeScreenBinding.toeflScore.text.toString()
            sop = activityHomeScreenBinding.sop.text.toString()
            lor = activityHomeScreenBinding.lor.text.toString()
            cgpa = activityHomeScreenBinding.cgpa.text.toString()
            research = activityHomeScreenBinding.research.text.toString()

        }


    }



}