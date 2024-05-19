package com.example.uts.data

import kotlinx.coroutines.flow.Flow

class OfflineAlumniRepository(private val alumniDao: AlumniDao) : AlumniRepository {
    override fun getAllAlumniStream(): Flow<List<Alumni>> = alumniDao.getAllAlumni()

    override fun getAlumniStream(id: Int): Flow<Alumni?> = alumniDao.getAlumni(id)

    override suspend fun insertAlumni(alumni: Alumni) = alumniDao.insertAlumni(alumni)

    override suspend fun updateAlumni(alumni: Alumni) = alumniDao.updateAlumni(alumni)

    override suspend fun deleteAlumni(alumni: Alumni) = alumniDao.deleteAlumni(alumni)
}