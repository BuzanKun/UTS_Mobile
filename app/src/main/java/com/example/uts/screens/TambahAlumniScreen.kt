package com.example.uts.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.uts.components.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TambahAlumniScreen(navController: NavHostController) {
    var nim by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var tempatLahir by remember { mutableStateOf("") }
    var tanggalLahir by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var agama by remember { mutableStateOf("") }
    var noTelp by remember { mutableStateOf("") }
    var tahunMasuk by remember { mutableStateOf("") }
    var tahunLulus by remember { mutableStateOf("") }
    var pekerjaan by remember { mutableStateOf("") }
    var jabatan by remember { mutableStateOf("") }

    val dateState = rememberDatePickerState()
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MenuHeader(navController)
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            TextField(
                value = nim,
                onValueChange = { nim = it },
                label = { Text(text = "NIM") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = nama,
                onValueChange = { nama = it },
                label = { Text(text = "Nama Alumni") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = tempatLahir,
                onValueChange = { tempatLahir = it },
                label = { Text(text = "Tempat Lahir") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = tanggalLahir,
                onValueChange = { tanggalLahir = it },
                label = { Text(text = "Tanggal Lahir") },
                enabled = false,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = {
                        showDialog = true
                    })
            )
            if(showDialog) {
                DatePickerDialog(
                    onDismissRequest = { showDialog = false },
                    confirmButton = {
                        Button(
                            onClick = {
                                tanggalLahir = dateState.selectedDateMillis?.let {
                                    val selectedDate =
                                        LocalDate.ofEpochDay(it / (24 * 60 * 60 * 1000))
                                    selectedDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                                } ?: ""
                                showDialog = false }
                        ) {
                            Text(text = "OK")
                        }
                    },
                    dismissButton = {
                        Button(
                            onClick = {showDialog = false}
                        ) {
                            Text(text = "Cancel")
                        }
                    }
                ) {
                    DatePicker(
                        state = dateState,
                        showModeToggle = true
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = alamat,
                onValueChange = { alamat = it },
                label = { Text(text = "Alamat") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = agama,
                onValueChange = { agama = it },
                label = { Text(text = "Agama") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = noTelp,
                onValueChange = { noTelp = it },
                label = { Text(text = "Tlp/Hp") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = tahunMasuk,
                onValueChange = { tahunMasuk = it },
                label = { Text(text = "Tahun Masuk") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = tahunLulus,
                onValueChange = { tahunLulus = it },
                label = { Text(text = "Tahun Lulus") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = pekerjaan,
                onValueChange = { pekerjaan = it },
                label = { Text(text = "Pekerjaan") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = jabatan,
                onValueChange = { jabatan = it },
                label = { Text(text = "Jabatan") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Simpan")
            }
        }
        MenuFooter(navController)
    }
}