package com.example.college_admission_prediction.UI.Login

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.example.college_admission_prediction.Others.UtilFun
import com.example.college_admission_prediction.databinding.ActivityLoginBinding

class LoginViewModel(application: Application) : AndroidViewModel(application)  {

    fun checkData(loginActivityBinding : ActivityLoginBinding, context: Context): Boolean{

        try {
            if (loginActivityBinding.userName.text!!.isNotEmpty()){
                if (loginActivityBinding.userName.text!!.contains("@")){
                    if(loginActivityBinding.password.text!!.isNotEmpty()){
                        return true
                    }
                    else{
                        UtilFun.showShortToast(context, "Enter password")
                    }
                }
                else{
                    UtilFun.showShortToast(context, "Enter valid email")
                }
            }else{
                UtilFun.showShortToast(context, "Enter Email")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return false
    }

}