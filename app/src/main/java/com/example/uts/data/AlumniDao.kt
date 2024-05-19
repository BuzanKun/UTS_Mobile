package com.example.uts.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.OnConflictStrategy
import kotlinx.coroutines.flow.Flow

@Dao
interface AlumniDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAlumni(alumni: Alumni)

    @Update
    suspend fun updateAlumni(alumni: Alumni)

    @Delete
    suspend fun deleteAlumni(alumni: Alumni)

    @Query("SELECT * FROM alumni_table where id = id")
    fun getAlumni(id: Int): Flow<Alumni>

    @Query("SELECT * FROM alumni_table ORDER BY nim")
    fun getAllAlumni(): Flow<List<Alumni>>
}