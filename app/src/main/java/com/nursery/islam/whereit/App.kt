package com.nursery.islam.whereit

import android.app.Application
import android.content.Context
import java.util.*

class App: Application() {
    companion object {
        fun create():App = App()
    }

    fun setAppLanguage(context:Context){
        val locale = Locale("ar")
        Locale.setDefault(locale)
        val resources = context.resources
        val configuration = resources.configuration
        context.createConfigurationContext(configuration)
        configuration.locale = locale
        resources.updateConfiguration(configuration, resources.displayMetrics)
        configuration.setLayoutDirection(locale)
    }

}