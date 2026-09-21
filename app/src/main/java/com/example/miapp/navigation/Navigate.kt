package com.example.miapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.miapp.uiApp.Home
import com.atom.MiApp.uiapp.Home
import com.atom.MiApp.uiapp.Deatil

@Composable
fun Navigate(){
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestinantion = "Home"
    ){
        composable("Home"){
            Home(navController)
        }
        compsable("Deatil"){
            Detail(navController)
        }
    }
}