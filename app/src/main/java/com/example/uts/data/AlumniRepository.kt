package com.example.uts.data

import kotlinx.coroutines.flow.Flow

/**
 * Repository that provides insert, update, delete, and retrieve of [Alumni] from a given data source.
 */
interface AlumniRepository {
    /**
     * Retrieve all the items from the the given data source.
     */
    fun getAllAlumniStream(): Flow<List<Alumni>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getAlumniStream(id: Int): Flow<Alumni?>

    /**
     * Insert item in the data source
     */
    suspend fun insertAlumni(alumni: Alumni)

    /**
     * Delete item from the data source
     */
    suspend fun deleteAlumni(alumni: Alumni)

    /**
     * Update item in the data source
     */
    suspend fun updateAlumni(alumni: Alumni)
}