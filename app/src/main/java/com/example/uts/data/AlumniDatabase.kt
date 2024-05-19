package com.example.uts.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Alumni::class], version = 1)
abstract class AlumniDatabase : RoomDatabase() {
    abstract fun alumniDao(): AlumniDao

    companion object{
        @Volatile
        private var Instance: AlumniDatabase? = null

        fun getDatabase(context: Context): AlumniDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, AlumniDatabase::class.java, "alumni_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}
