package com.example.uts.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alumni_table")
data class Alumni(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val nim: String,
    val nama: String,
    val tempatLahir: String,
    val tanggalLahir: String,
    val alamat: String,
    val agama: String,
    val noTelp: String,
    val tahunMasuk: String,
    val tahunLulus: String,
    val pekerjaan: String,
    val jabatan: String
)