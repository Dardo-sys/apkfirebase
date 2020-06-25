package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btnRegistro2.setOnClickListener {
            val intent: Intent = Intent(this, conectando::class.java)
            startActivity(intent)
            finish()

        }

        btnVolver4.setOnClickListener {
            val intent: Intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
            finish()

        }





    }
}
