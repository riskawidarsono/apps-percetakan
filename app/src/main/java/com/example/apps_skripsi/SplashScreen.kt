package com.example.apps_skripsi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity(){
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
    }
    private val runnable = Runnable {
        if (!isFinishing){
            startActivity(Intent(applicationContext,MainActivity::class.java))
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable,1500)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }

}