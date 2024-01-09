package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNameText = findViewById<EditText>(R.id.firstName)
        val lastNameText = findViewById<EditText>(R.id.lastName)
        val ageText = findViewById<EditText>(R.id.age)

        val processButton = findViewById<Button>(R.id.btnProcess)

        processButton.setOnClickListener{
            val firstName = firstNameText.text.toString()
            val lastName = lastNameText.text.toString()
            val age = ageText.text.toString()
            val nextPageIntent = Intent(this,DataProcessor::class.java)

            nextPageIntent.putExtra("First_Name",firstName)
            nextPageIntent.putExtra("Last_Name",lastName)
            nextPageIntent.putExtra("Age",age)

            startActivity(nextPageIntent)
        }


    }
}