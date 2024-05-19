package com.example.uts.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.uts.components.*
import com.example.uts.R

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MenuHeader(navController)
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier.weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = stringResource(id = R.string.about_title),
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = stringResource(id = R.string.about_pertama),
                fontSize = 20.sp,
                modifier = Modifier.padding(12.dp)
            )
            Text(
                text = stringResource(id = R.string.about_kedua),
                fontSize = 20.sp,
                modifier = Modifier.padding(12.dp)
            )
        }
        MenuFooter(navController)
    }
}