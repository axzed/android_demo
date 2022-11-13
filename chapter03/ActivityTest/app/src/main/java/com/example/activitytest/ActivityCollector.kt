package com.example.activitytest

import android.app.Activity

object ActivityCollector {

    private val activities = ArrayList<Activity>()

    // addActivity to add the new create Activity in collector
    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    // removeActivity to remove the Activity
    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    // finishAll to finish all Activity
    fun finishAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activities.clear()
    }
}