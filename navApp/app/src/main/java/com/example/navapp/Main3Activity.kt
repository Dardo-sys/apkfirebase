package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnVolver3.setOnClickListener {
            val intent: Intent = Intent(this, Main9Activity::class.java)
            startActivity(intent)
            finish()

        }

        btnIr3.setOnClickListener {
            val intent: Intent = Intent(this, Main5Activity::class.java)
            startActivity(intent)
            finish()

        }


    }
}
