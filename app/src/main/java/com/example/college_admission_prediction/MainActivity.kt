package com.example.college_admission_prediction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.college_admission_prediction.Others.UtilFun
import com.example.college_admission_prediction.UI.Login.LoginActivity
import com.example.college_admission_prediction.UI.homeScreen.homeScreen
import com.example.college_admission_prediction.database.UserRepository
import com.example.college_admission_prediction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val repository : UserRepository = UserRepository(this)

        try {
            val flags = View.SYSTEM_UI_FLAG_LOW_PROFILE or
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            window?.decorView?.systemUiVisibility = flags
            supportActionBar?.hide()

            if (UtilFun.checkForInternet(this)) {
                if (repository.getAllDataCount() == 1) {// for checking os the user is logged in or not
                    val intent = Intent(this, homeScreen::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            } else {
                UtilFun.showShortToast(this, "Check Internet Connectivity, Please reopen the app in case of delay")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}