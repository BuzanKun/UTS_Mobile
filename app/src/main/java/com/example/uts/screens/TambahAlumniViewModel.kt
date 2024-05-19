package com.example.uts.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.uts.data.Alumni
import com.example.uts.data.AlumniRepository

class TambahAlumniViewModel(private val alumniRepository: AlumniRepository) : ViewModel() {

    /**
     * Holds current item ui state
     */
    var alumniUiState by mutableStateOf(AlumniUiState())
        private set

    /**
     * Updates the [alumniUiState] with the value provided in the argument. This method also triggers
     * a validation for input values.
     */
    fun updateUiState(alumniDetails: AlumniDetails) {
        alumniUiState =
            AlumniUiState(alumniDetails = alumniDetails, isEntryValid = validateInput(alumniDetails))
    }

    suspend fun saveItem() {
        if (validateInput()) {
            alumniRepository.insertAlumni(alumniUiState.alumniDetails.toAlumni())
        }
    }

    private fun validateInput(uiState: AlumniDetails = alumniUiState.alumniDetails): Boolean {
        return with(uiState) {
            nim.isNotBlank() &&
            nama.isNotBlank() &&
            tempatLahir.isNotBlank() &&
            tanggalLahir.isNotBlank() &&
            alamat.isNotBlank() &&
            agama.isNotBlank() &&
            noTelp.isNotBlank() &&
            tahunMasuk.isNotBlank() &&
            tahunLulus.isNotBlank() &&
            pekerjaan.isNotBlank() &&
            jabatan.isNotBlank()
        }
    }
}

/**
 * Represents Ui State for an Item.
 */
data class AlumniUiState(
    val alumniDetails: AlumniDetails = AlumniDetails(),
    val isEntryValid: Boolean = false
)

data class AlumniDetails(
    val id: Long = 0,
    val nim: String = "",
    val nama: String = "",
    val tempatLahir: String = "",
    val tanggalLahir: String = "",
    val alamat: String = "",
    val agama: String = "",
    val noTelp: String = "",
    val tahunMasuk: String = "",
    val tahunLulus: String = "",
    val pekerjaan: String = "",
    val jabatan: String = ""
)
/**
 * Extension function to convert [ItemDetails] to [Item]. If the value of [ItemDetails.price] is
 * not a valid [Double], then the price will be set to 0.0. Similarly if the value of
 * [ItemDetails.quantity] is not a valid [Int], then the quantity will be set to 0
 */
fun AlumniDetails.toAlumni(): Alumni = Alumni(
    id = id,
    nim = nim,
    nama = nama,
    tempatLahir = tempatLahir,
    tanggalLahir = tanggalLahir,
    alamat = alamat,
    agama = agama,
    noTelp = noTelp,
    tahunMasuk = tahunMasuk,
    tahunLulus = tahunLulus,
    pekerjaan = pekerjaan,
    jabatan = jabatan
)

/**
 * Extension function to convert [Item] to [ItemUiState]
 */
fun Alumni.toAlumniUiState(isEntryValid: Boolean = false): AlumniUiState = AlumniUiState(
    alumniDetails = this.toAlumniDetails(),
    isEntryValid = isEntryValid
)

/**
 * Extension function to convert [Item] to [ItemDetails]
 */
fun Alumni.toAlumniDetails(): AlumniDetails = AlumniDetails(
    id = id,
    nim = nim,
    nama = nama,
    tempatLahir = tempatLahir,
    tanggalLahir = tanggalLahir,
    alamat = alamat,
    agama = agama,
    noTelp = noTelp,
    tahunMasuk = tahunMasuk,
    tahunLulus = tahunLulus,
    pekerjaan = pekerjaan,
    jabatan = jabatan
)
