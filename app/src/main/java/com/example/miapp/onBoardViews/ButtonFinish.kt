package com.example.miapp.onBoardViews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.miapp.data.DataStoreM
import com.example.miapp.views.HomeView
import kotlinx.coroutines.launch

@Composable
fun ButtonFinish(currentPage: Int, onClick: () -> Unit, saveBoardingState: T.(Boolean) -> Unit) { // Agregamos la acción de navegación como parámetro
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = remember { DataStoreM(context) }

    Row(
        modifier = Modifier
            .padding(bottom = 100.dp)
            .fillMaxWidth(),
        horizontalArrangement = if (currentPage != 1) Arrangement.Center else Arrangement.SpaceBetween
    ) {
        if (currentPage == 2) {
            OutlinedButton(
                onClick = {
                    scope.launch {
                        dataStore.saveBoardingState(true) // 1. Guarda en DataStore
                        HomeView()                        // 2. Navega a HomeView
                    }
                }
            ) {
                Text(
                    text = "Entrar",
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 40.dp),
                    color = Color.Gray
                )
            }
        }
    }
}