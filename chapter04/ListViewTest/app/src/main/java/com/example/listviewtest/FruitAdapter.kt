package com.example.listviewtest

import android.app.Activity
import android.widget.ArrayAdapter

class FruitAdapter(activity: Activity, val resourceId: Int, data: List<Fruit>) : ArrayAdapter<Fruit>(activity, resourceId, data){

}