
package com.example.kotlincounter

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        value.setText("" + id)

        plusBtn.setOnClickListener {
            value.setText("" + ++id)
        }

        minusBtn.setOnClickListener {
            value.setText("" + --id)
        }
    }
}