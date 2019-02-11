package com.nursery.islam.whereit

import android.app.Activity
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat

class AppUtils {

    companion object {
        fun changeStatusBarColor(activity: Activity){
            val window:Window = activity.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = ContextCompat.getColor(activity,R.color.colorPrimary)
        }
    }

}