package com.example.uts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.uts.Berita
import com.example.uts.DataProvider
import com.example.uts.components.*

@Composable
fun BeritaScreen(navController: NavHostController) {
    val beritas = remember { DataProvider.beritaList }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MenuHeader(navController)
        LazyColumn(
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.weight(1f)
        ) {
            items(
                items = beritas,
                itemContent = { berita ->
                    BeritaListItem(berita = berita, navController = navController)
                }
            )
        }
        MenuFooter(navController)
    }
}

@Composable
fun BeritaListItem(berita: Berita, navController: NavHostController) {
    Card(
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { navController.navigate("detail/${berita.id}") }
    ) {
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = berita.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(100.dp)
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = berita.judul,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 18.sp,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = berita.deskripsi,
                    fontSize = 12.sp,
                    lineHeight = 14.sp
                )
            }
        }
    }
}