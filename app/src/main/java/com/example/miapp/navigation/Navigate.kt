package com.example.miapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.miapp.uiApp.Home
import com.example.miapp.uiApp.Detail

@Composable
fun Navigate(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Home"
    ){
        composable("Home"){
            Home(navController)
        }
        composable("Deatil"){
            Detail(navController)
        }
    }
}