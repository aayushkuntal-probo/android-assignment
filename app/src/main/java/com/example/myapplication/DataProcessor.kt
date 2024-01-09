package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataProcessor: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_processed)

        val firstName = intent.getStringExtra("First_Name")
        val lastName = intent.getStringExtra("Last_Name")
        val age = intent.getStringExtra("Age")

        val displayTextView = findViewById<TextView>(R.id.displayProcessedView)
        displayTextView.text = getString(R.string.processed_string,firstName,lastName,age)
    }
}