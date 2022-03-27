package com.example.college_admission_prediction.UI.Registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.college_admission_prediction.Others.UtilFun
import com.example.college_admission_prediction.R
import com.example.college_admission_prediction.databinding.ActivityLoginBinding
import com.example.college_admission_prediction.databinding.ActivityRegisterationBinding

class Registeration : AppCompatActivity() {

    private lateinit var registrationBinding : ActivityRegisterationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            registrationBinding = ActivityRegisterationBinding.inflate(layoutInflater)
            setContentView(registrationBinding.root)

        try {

            title = "Registration"

            registrationBinding.register.setOnClickListener {
                register()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun register(){
        if(UtilFun.checkForInternet(this)){
            if(registrationBinding.userName.text!!.isNotEmpty()){
                if (registrationBinding.userName.text!!.contains("@")){
                    if(registrationBinding.password.text!!.isNotEmpty()){
                        if(registrationBinding.phoneNumber.text!!.length != 10){
                            if(registrationBinding.country.text!!.isNotEmpty()){
                                // enter API
                            }
                            else{
                                UtilFun.showShortToast(this, "Enter country name")
                            }
                        }
                        else{
                            UtilFun.showShortToast(this, "Enter valid phone number")
                        }
                    }
                    else{
                        UtilFun.showShortToast(this, "Enter password")
                    }
                }
                else{
                    UtilFun.showShortToast(this, "Enter valid email")
                }
            }
            else{
                UtilFun.showShortToast(this, "Enter Email")
            }
        }
        else{
            UtilFun.showShortToast(this, "Check Internet Connectivity")
        }
    }

}