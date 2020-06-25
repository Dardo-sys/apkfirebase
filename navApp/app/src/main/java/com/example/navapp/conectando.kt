package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class conectando : AppCompatActivity() {

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conectando)

        handler = Handler()
        handler.postDelayed({

            // Delay and Start Activity
            val intent = Intent(this,Main8Activity::class.java)
            startActivity(intent)
            finish()
        } , 5000) // here we're delaying to startActivity after 3seconds

    }
}