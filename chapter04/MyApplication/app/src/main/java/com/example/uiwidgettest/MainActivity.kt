package com.example.uiwidgettest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val submit: Button = findViewById(R.id.btn_submit)
        val changeImage: Button = findViewById(R.id.btn_change_image)
        val changeVis: Button = findViewById(R.id.btn_change_vis)
        val alert: Button = findViewById(R.id.btn_alert)
//        button.setOnClickListener {
//            Toast.makeText(this, "You clicked the Button", Toast.LENGTH_SHORT).show()
//        }
        button.setOnClickListener(this)
        submit.setOnClickListener(this)
        changeImage.setOnClickListener(this)
        changeVis.setOnClickListener(this)
        alert.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    // 实现接口,重写方法,每次点击任何按钮都会执行onClick该方法内的逻辑了
    // 在按钮多的情况下用这种方法更好
    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.button -> {
                Toast.makeText(this, "You clicked the Button", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_submit -> {
                // 获取editText
                val editText: EditText = findViewById(R.id.editText)
                // 获取EditText中的内容
                val inputText = editText.text?.toString()
                // 使用Toast展示获取的内容
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            }
            R.id.btn_change_image -> {
                val imageView: ImageView = findViewById(R.id.imageView)
                imageView.setImageResource(R.drawable.img_2)
            }
            R.id.btn_change_vis -> {
                val progressBar: ProgressBar = findViewById(R.id.progressBar)
                if (progressBar.visibility == View.VISIBLE) {
                    progressBar.visibility = View.GONE
                } else {
                    progressBar.visibility = View.VISIBLE
                }
            }
            R.id.btn_alert -> {
                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important.")
                    setCancelable(false)
                    setPositiveButton("ok") { dialog, which ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                }.show()
            }
        }
    }

}