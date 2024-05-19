package com.example.uts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.uts.DataProvider

@Composable
fun DetailBerita(beritaId: Int, navController: NavHostController) {
    val berita = DataProvider.getBeritaById(beritaId)
    if (berita != null) {
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            Column(
                modifier = Modifier.weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painter = painterResource(id = berita.headerImage),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                        .height(200.dp)
                )
                Text(
                    text = berita.judul,
                    fontSize = 28.sp,
                    lineHeight = 32.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = berita.isiKonten,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
            Button(
                onClick = { navController.popBackStack() },
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier.align(Alignment.End)
                    .padding(8.dp)
            ) {
                Text(text = "Back")
            }
        }
    } else {
        // Handle null berita
    }
}