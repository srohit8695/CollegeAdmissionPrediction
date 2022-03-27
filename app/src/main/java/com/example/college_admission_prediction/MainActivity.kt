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
    private val repository : UserRepository = UserRepository(application)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val flags = View.SYSTEM_UI_FLAG_LOW_PROFILE or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        window?.decorView?.systemUiVisibility = flags
        supportActionBar?.hide()

        if (UtilFun.checkForInternet(this)) {
            if (true) {//repository.getAllDataCount() == 1
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

    }
}