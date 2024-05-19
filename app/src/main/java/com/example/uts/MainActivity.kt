package com.example.uts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.uts.screens.BeritaScreen
import com.example.uts.screens.DetailBerita
import com.example.uts.screens.HomeScreen
import com.example.uts.screens.LoginScreen
import com.example.uts.screens.ProfileScreen
import com.example.uts.screens.TambahAlumniScreen
import com.example.uts.ui.theme.UTSTheme
import com.example.uts.utils.PreferencesManager

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

    @Composable
    fun AlumniApp() {
        val navController = rememberNavController()

        val startDestination = if (PreferencesManager.isLoggedIn(this)) "home" else "login"
        NavHost(navController = navController, startDestination = startDestination) {
            composable("login") { LoginScreen(navController = navController) }
            composable("home") { HomeScreen(navController = navController) }
            composable("berita") { BeritaScreen(navController = navController) }
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
            composable("profile") { ProfileScreen(navController = navController) }
            composable("tambahAlumni") { TambahAlumniScreen(navController = navController) }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        AlumniApp()
    }
}