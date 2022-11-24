package com.example.filepersistencetest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputText = load()
        if (inputText.isNotEmpty()) {
            val editText: EditText = findViewById(R.id.editText)
            editText.setText(inputText)
            editText.setSelection(inputText.length)
            Toast.makeText(this, "Restoring succeeded", Toast.LENGTH_SHORT).show()
        }
    }

    // 按下Back后activity被销毁的时候存储数据
    override fun onDestroy() {
        super.onDestroy()
        val editText: EditText = findViewById(R.id.editText)
        val inputText = editText.text.toString()
        save(inputText)
    }

    // save is a method to save the data
    private fun save(inputText: String) {
        try {
            val output = openFileOutput("data", Context.MODE_PRIVATE)
            val writer = BufferedWriter(OutputStreamWriter(output))
            writer.use {
                it.write(inputText)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    // load is a method to read the data in file
    private fun load(): String {
        val content = StringBuilder()

        try {
            val input = openFileInput("data")
            val reader = BufferedReader(InputStreamReader(input))
            reader.use {
                reader.forEachLine {
                    content.append(it)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return content.toString()
    }
}