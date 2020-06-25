package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnVolver2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

        btnIngresar.setOnClickListener {
            val intent: Intent = Intent(this, conectando2::class.java)
            startActivity(intent)
            finish()


        }

        btnRegistro.setOnClickListener {
            val intent: Intent = Intent(this, Main4Activity::class.java)
            startActivity(intent)
            finish()


        }
    }
}

