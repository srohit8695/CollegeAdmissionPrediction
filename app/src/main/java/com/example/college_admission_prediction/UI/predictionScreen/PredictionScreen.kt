package com.example.college_admission_prediction.UI.predictionScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.college_admission_prediction.R
import com.example.college_admission_prediction.databinding.ActivityLoginBinding
import com.example.college_admission_prediction.databinding.ActivityPredictionScreenBinding

class PredictionScreen : AppCompatActivity() {


    private lateinit var predictionScreenBinding: ActivityPredictionScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        predictionScreenBinding = ActivityPredictionScreenBinding.inflate(layoutInflater)
        setContentView(predictionScreenBinding.root)

        title = "Recommend Colleges"



    }
}