package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ayuda_contador.*
import kotlinx.android.synthetic.main.activity_ayuda_suerte.*

class ayudaSuerte : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda_suerte)

        btnVolverAyuda2.setOnClickListener {
            val intent: Intent = Intent(this, Main6Activity::class.java)
            startActivity(intent)
            finish()

        }
    }
}
