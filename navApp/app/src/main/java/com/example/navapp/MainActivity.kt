package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // display Toast here...
        Toast.makeText(this,"Gracias por su Visita",Toast.LENGTH_SHORT).show()


        btnIr8.setOnClickListener {
            val intent: Intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
            finish()


        }
    }
}