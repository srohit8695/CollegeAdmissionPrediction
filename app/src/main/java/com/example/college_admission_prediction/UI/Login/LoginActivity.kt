package com.example.college_admission_prediction.UI.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.college_admission_prediction.Others.UtilFun
import com.example.college_admission_prediction.R
import com.example.college_admission_prediction.UI.Registration.Registeration
import com.example.college_admission_prediction.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var loginActivityBinding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginActivityBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginActivityBinding.root)

        loginActivityBinding.login.setOnClickListener {
            login()
        }

        loginActivityBinding.signup.setOnClickListener {
            val intent = Intent(this, Registeration::class.java)
            startActivity(intent)
        }

    }

    private fun login(){
        try {
            if(UtilFun.checkForInternet(this)){
                if (loginActivityBinding.userName.text!!.isNotEmpty()){
                    if (loginActivityBinding.userName.text!!.contains("@")){
                        if(loginActivityBinding.password.text!!.isNotEmpty()){
                            //  API Call
                        }
                        else{
                            UtilFun.showShortToast(this, "Enter password")
                        }
                    }
                    else{
                        UtilFun.showShortToast(this, "Enter valid email")
                    }
                }else{
                    UtilFun.showShortToast(this, "Enter Email")
                }
            }
            else{
                UtilFun.showShortToast(this, "Check Internet Connectivity")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}