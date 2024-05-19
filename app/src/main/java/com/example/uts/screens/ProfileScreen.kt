package com.example.uts.screens

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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import com.example.uts.utils.PreferencesManager

@Composable
fun ProfileScreen(navController: NavHostController) {
    val context = navController.context
    val userData = PreferencesManager.getUserData(context)

    var email by remember { mutableStateOf(userData["email"]?: "") }
    var nim by remember { mutableStateOf(userData["nim"]?: "") }
    var nama by remember { mutableStateOf(userData["nama"]?: "") }
    var kelas by remember { mutableStateOf(userData["kelas"]?: "") }

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
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Email") },
                enabled = false,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = nim,
                onValueChange = { nim = it },
                label = { Text(text = "NIM") },
                enabled = false,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = nama,
                onValueChange = { nama = it },
                label = { Text(text = "Nama") },
                enabled = false,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = kelas,
                onValueChange = { kelas = it },
                label = { Text(text = "Kelas") },
                enabled = false,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                    PreferencesManager.clearLoginState(context)
                    navController.navigate("login") {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                    }
                },
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Logout")
            }
        }
        MenuFooter(navController)
    }
}