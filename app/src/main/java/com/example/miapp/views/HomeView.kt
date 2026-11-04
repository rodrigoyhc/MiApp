package com.example.miapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.miapp.data.DataStoreM

@Composable
fun HomeView() {
    val context = LocalContext.current
    val dataStore = remember { DataStoreM(context) }

    // Leemos el valor del DataStore como State en Compose
    val isBoardingCompleted by dataStore.isBoardingCompleted.collectAsState(initial = false)

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "¡Bienvenido al Home!")
        Text(text = "Onboarding completado: $isBoardingCompleted")
    }
}