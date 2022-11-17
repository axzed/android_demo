package com.example.activityjump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val editText1Data = intent.getStringExtra("editText1Data")
        var editText2: EditText = findViewById(R.id.editText2)
//        editText2.setText("接收的数据为: " + editText1Data)
        editText2.hint = "接收的数据为: " + editText1Data

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent()
            val editText2Data = editText2.text.toString()
            intent.putExtra("data_return", editText2Data)
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun onClick(v: View?) {

    }
}