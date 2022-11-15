package com.example.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

// 自定义控件(可以包含逻辑处理)
class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    // 加载自定义layout控件
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        val titleBack: Button = findViewById(R.id.btn_title_back)
        val titleEdit: Button = findViewById(R.id.btn_title_edit)

        titleBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        titleEdit.setOnClickListener {
            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }
}