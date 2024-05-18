package com.example.uts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.uts.ui.theme.UTSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTSTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AlumniApp()
                }
            }
        }
    }
}

private const val correctEmail: String = "abc"
private const val correctPassword: String = "abc"

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier.width(50.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                if (email == correctEmail && password == correctPassword) {
                    navController.navigate("home")
                } else {
                    errorMessage = "Incorrect Email or Password"
                }
            },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Login")
        }
        errorMessage?.let { message ->
            Text(
                text = message,
                color = Color.Red,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MenuHeader(navController)
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier.weight(1f)
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

@Composable
fun ProfileScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var kelas by remember { mutableStateOf("") }

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
        ) {
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Email") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
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
                label = { Text(text = "Nama") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = kelas,
                onValueChange = { kelas = it },
                label = { Text(text = "Kelas") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { navController.navigate("login") },
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Logout")
            }
        }
        MenuFooter(navController)
    }
}

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
                modifier = Modifier.fillMaxWidth()
            )
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

@Composable
fun MenuHeader(navController: NavHostController) {
    var expanded by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopEnd)
        ) {
            IconButton(onClick = { expanded = !expanded }) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "More"
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Tambah Data") },
                    onClick = { navController.navigate("tambahAlumni") }
                )
                DropdownMenuItem(
                    text = { Text("Data Alumni") },
                    onClick = { navController.navigate("profile") }
                )
                DropdownMenuItem(
                    text = { Text("Logout") },
                    onClick = { navController.navigate("login") }
                )
            }
        }
    }
}

@Composable
fun MenuFooter(navController: NavHostController) {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.weight(1f),
            shape = RectangleShape
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navController.navigate("berita") },
            modifier = Modifier.weight(1f),
            shape = RectangleShape
        ) {
            Text(text = "Berita")
        }
        Button(
            onClick = { navController.navigate("profile") },
            modifier = Modifier.weight(1f),
            shape = RectangleShape
        ) {
            Text(text = "Profile")
        }
    }
}

@Composable
fun AlumniApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }
        composable("profile") {
            ProfileScreen(navController)
        }
        composable("berita") {
            BeritaScreen(navController)
        }
        composable(
            route = "detail/{beritaId}",
            arguments = listOf(navArgument("beritaId") { type = NavType.IntType })
        ) { backStackEntry ->
            val beritaId = backStackEntry.arguments?.getInt("beritaId")
            if (beritaId != null) {
                DetailBerita(beritaId, navController = navController)
            } else {
                // Handle invalid beritaId
            }
        }
        composable("tambahAlumni") {
            TambahAlumniScreen(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UTSTheme {
        AlumniApp()
    }
}