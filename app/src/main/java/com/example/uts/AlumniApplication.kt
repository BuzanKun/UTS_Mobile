package com.example.uts

import android.app.Application
import com.example.uts.data.AppContainer
import com.example.uts.data.AppDataContainer

class AlumniApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
