package com.example.activityjump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: Button = findViewById(R.id.button1)
        val editText1: EditText = findViewById(R.id.editText1)
        button1.setOnClickListener {
            val data = editText1.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("editText1Data", data)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                val returnData = data?.getStringExtra("data_return")
                val editText1: EditText = findViewById(R.id.editText1)
                editText1.text = null
                editText1.hint = "返回的数据为: " + returnData
            }
        }
    }
}