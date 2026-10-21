package com.example.miapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.miapp.data.StoreDarkMode
import com.example.miapp.views.LoginView
import com.example.miapp.views.RegisterView

@Composable
fun NavManager(
    darkModeStore: StoreDarkMode,
    darkMode: Boolean
) {
    val navController = rememberNavController()
    val context = LocalContext.current

    val darkModeStore = remember { StoreDarkMode(context) }
    val darkMode by darkModeStore.getDarkMode.collectAsState(initial = false)

    NavHost(navController = navController, startDestination = "Login") {

        composable("Login") {
            LoginView(
                navController = navController,
                darkModeStore = darkModeStore,
                darkMode = darkMode
            )
        }

        composable("Register") {
            RegisterView(
                navController = navController,
                darkModeStore = darkModeStore,
                darkMode = darkMode
            )
        }

        composable("Home") {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "¡Vista Home (Próximamente con foto de perfil)!")
            }
        }
    }
}