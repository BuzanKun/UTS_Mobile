package com.example.uts.data

import android.content.Context

interface AppContainer {
    val alumniRepository: AlumniRepository
}


class AppDataContainer(private val context: Context) : AppContainer{
    override val alumniRepository: AlumniRepository by lazy {
        OfflineAlumniRepository(AlumniDatabase.getDatabase(context).alumniDao())
    }
}