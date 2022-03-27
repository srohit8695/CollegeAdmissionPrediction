package com.example.college_admission_prediction.Adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.college_admission_prediction.databinding.CollegePredictedBinding
import com.example.college_admission_prediction.model.CollegePredicted
import kotlin.random.Random


class CollegeAdapter(private var arrayList : MutableList<CollegePredicted>, val context: Context) : RecyclerView.Adapter<CollegeAdapter.CollegeViewHolder>(){

    inner class CollegeViewHolder(val binding: CollegePredictedBinding) : RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): CollegeAdapter.CollegeViewHolder {
            return CollegeViewHolder(
                CollegePredictedBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(holder: CollegeViewHolder, position: Int) {
            try {
                with(holder){
                    with(arrayList[position]){

                        binding.college.text = arrayList[position].college
                        binding.percentage.text = arrayList[position].percentage
                        if (Random.nextInt(0, 3) % 2 == 0){
                            binding.percentage.setBackgroundColor(Color.RED)
                        }else{
                            binding.percentage.setBackgroundColor(Color.GREEN)
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        override fun getItemCount() = arrayList.size


    }




