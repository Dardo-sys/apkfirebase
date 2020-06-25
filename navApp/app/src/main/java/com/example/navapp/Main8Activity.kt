package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main8.*

class Main8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        btnIr8.setOnClickListener {
            val intent: Intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
            finish()

        }



    }
}
