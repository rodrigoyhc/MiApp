package com.example.miapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.miapp.data.StoreDarkMode
import com.example.miapp.navigation.NavManager
import com.example.miapp.ui.theme.MiAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val darkModeStore = StoreDarkMode(this)
            val darkMode=darkModeStore.getDarkMode.collectAsState(false)
            MiAppTheme(
                darkTheme = darkMode.value
            ) {
                Surface(
                    modifier= Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background
                ) {
                    NavManager(darkModeStore, darkMode.value)
                }
            }
        }
    }
}
