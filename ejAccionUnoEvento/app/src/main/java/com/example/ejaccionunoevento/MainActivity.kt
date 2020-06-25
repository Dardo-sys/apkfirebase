package com.example.ejaccionunoevento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val mBtn = findViewById<Button>(R.id.btn) as Button
            mBtn.setOnClickListener {
                Toast.makeText(this, "Button is clicked", Toast.LENGTH_LONG).show();
            }

        }
    }
    }
}
