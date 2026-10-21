package com.example.miapp.views

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.miapp.data.StoreDarkMode
import com.example.miapp.data.StoreUserMail
import kotlinx.coroutines.launch

@Composable
fun LoginView(
    navController: NavController,
    darkModeStore: StoreDarkMode,
    darkMode: Boolean
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val userDataStore = remember { StoreUserMail(context) }

    val savedUser by userDataStore.getUserName.collectAsState(initial = "")
    val savedPassword by userDataStore.getPassword.collectAsState(initial = "")

    var user by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(text = "Iniciar Sesión", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = user,
            onValueChange = { user = it },
            label = { Text("Usuario") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            if (savedUser.isEmpty()) {
                Toast.makeText(context, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            } else if (user == savedUser && password == savedPassword) {
                Toast.makeText(context, "¡Bienvenido!", Toast.LENGTH_SHORT).show()
                navController.navigate("Home") {
                    popUpTo("Login") { inclusive = true }
                }
            } else {
                Toast.makeText(context, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text("Ingresar")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                navController.navigate("Register")
            },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.DarkGray
            )
        ) {
            Text("Registrarse")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            scope.launch { darkModeStore.saveDarkMode(!darkMode) }
        }) {
            Text(if (darkMode) "Modo Claro" else "Modo Oscuro")
        }
    }
}