package com.example.college_admission_prediction.UI.homeScreen

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.example.college_admission_prediction.Others.UtilFun
import com.example.college_admission_prediction.databinding.ActivityHomeScreenBinding

class HomeScreenViewModel(application: Application) : AndroidViewModel(application) {

    fun checkData(activityHomeScreenBinding : ActivityHomeScreenBinding, context: Context) : Boolean{

        if(activityHomeScreenBinding.greScore.text!!.isNotEmpty()){
            if(activityHomeScreenBinding.toeflScore.text!!.isNotEmpty()){
                if(activityHomeScreenBinding.sop.text!!.isNotEmpty()){
                    if(activityHomeScreenBinding.lor.text!!.isNotEmpty()){
                        if(activityHomeScreenBinding.cgpa.text!!.isNotEmpty()){
                            if(activityHomeScreenBinding.research.text!!.isNotEmpty()){
                                return true
                            }
                            else{
                                UtilFun.showShortToast(context,"")
                            }
                        }
                        else{
                            UtilFun.showShortToast(context,"")
                        }
                    }
                    else{
                        UtilFun.showShortToast(context,"")
                    }
                }
                else{
                    UtilFun.showShortToast(context,"")
                }
            }
            else{
                UtilFun.showShortToast(context,"")
            }
        }
        else{
         UtilFun.showShortToast(context,"")
        }

        return false
    }


    fun checkCountry(activityHomeScreenBinding : ActivityHomeScreenBinding) : Boolean{

        if(activityHomeScreenBinding.countryName.text!!.isNotEmpty()){
            return true
        }

        return false
    }

}