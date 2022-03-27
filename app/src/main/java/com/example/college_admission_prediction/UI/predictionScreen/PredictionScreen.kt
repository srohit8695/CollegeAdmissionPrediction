package com.example.college_admission_prediction.UI.predictionScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.college_admission_prediction.Adapters.CollegeAdapter
import com.example.college_admission_prediction.R
import com.example.college_admission_prediction.databinding.ActivityLoginBinding
import com.example.college_admission_prediction.databinding.ActivityPredictionScreenBinding
import com.example.college_admission_prediction.model.CollegePredicted

class PredictionScreen : AppCompatActivity() {


    private lateinit var predictionScreenBinding: ActivityPredictionScreenBinding
    private var adapter: CollegeAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            predictionScreenBinding = ActivityPredictionScreenBinding.inflate(layoutInflater)
            setContentView(predictionScreenBinding.root)

            title = "Recommend Colleges"

            val list: ArrayList<CollegePredicted> = arrayListOf<CollegePredicted>()
            list.add(CollegePredicted("College A", "46%"))


            adapter = CollegeAdapter(list ,this)
            predictionScreenBinding.collegeRecyclerView.adapter = adapter
        } catch (e: Exception) {
            e.printStackTrace()
        }


    }
}