package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ayuda_contador.*
import kotlinx.android.synthetic.main.activity_main6.*

class ayudaContador : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda_contador)

        btnVolverAyuda.setOnClickListener {
            val intent: Intent = Intent(this, Main7Activity::class.java)
            startActivity(intent)
            finish()

        }


    }
}
