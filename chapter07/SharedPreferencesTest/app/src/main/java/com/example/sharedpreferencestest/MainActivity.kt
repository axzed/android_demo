package com.example.sharedpreferencestest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val saveButton: Button = findViewById(R.id.saveButton)
        saveButton.setOnClickListener {
            val editor = getSharedPreferences("data", Context.MODE_PRIVATE).edit()
            editor.putString("name", "Tom")
            editor.putInt("age", 18)
            editor.putBoolean("married", false)
            editor.apply()
        }
    }
}