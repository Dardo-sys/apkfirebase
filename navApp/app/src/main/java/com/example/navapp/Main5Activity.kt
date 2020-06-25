package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        btnVolver5.setOnClickListener {
            val intent: Intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
            finish()

        }

        btnJuego.setOnClickListener {
            val intent: Intent = Intent(this, Main6Activity::class.java)
            startActivity(intent)
            finish()

        }

        btnContador.setOnClickListener {
            val intent: Intent = Intent(this, Main7Activity::class.java)
            startActivity(intent)
            finish()

        }


    }
}
