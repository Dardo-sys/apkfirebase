package com.example.contadorm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class contador : AppCompatActivity() {
    var contador=0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnContar.setOnClickListener{
            contador++

            textView.text=contador.toString()

        }

    }
}
