package com.example.contador

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Override

        protected void onSaveInstanceState(Bundle outState) {

            super.onSaveInstanceState(outState);

            outState.putInt("counter", counter);

        }


        @Override

        protected void onRestoreInstanceState(Bundle savedInstanceState) {

            super.onRestoreInstanceState(savedInstanceState);

            counter = savedInstanceState.getInt("counter");

            tvCounter.setText("Counter: " + counter);

        }
    }
}




