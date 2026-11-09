package com.example.miapp.onBoardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.RestartAlt
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Contador(currentPage: Int) {
    var contador by remember { mutableStateOf(0) }
    var contador2 by remember { mutableStateOf(0) }

    if (currentPage == 0) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Círculo con el puntaje
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .background(color = Color.Blue, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "$contador", fontSize = 40.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Botón +3
                Button(
                    onClick = { contador += 3 },
                    modifier = Modifier.height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("3", fontSize = 18.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Botón +2
                Button(
                    onClick = { contador += 2 },
                    modifier = Modifier.height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("2", fontSize = 18.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Botón +1 Tiros Libres
                Button(
                    onClick = { contador += 1 },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("1. Tiros Libres", fontSize = 18.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Botón reset
                Button(
                    onClick = { contador = 0 },
                    modifier = Modifier.height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.RestartAlt,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Resetear", fontSize = 18.sp, color = Color.White)
                }
            }
        }
    }

    if (currentPage == 1) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Círculo con el puntaje
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .background(color = Color.Blue, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "$contador2", fontSize = 40.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Botón +3
                Button(
                    onClick = { contador2 += 3 },
                    modifier = Modifier.height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("3", fontSize = 18.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Botón +2
                Button(
                    onClick = { contador2 += 2 },
                    modifier = Modifier.height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("2", fontSize = 18.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Botón +1 Tiros Libres
                Button(
                    onClick = { contador2 += 1 },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("1. Tiros Libres", fontSize = 18.sp, color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Botón reset
                Button(
                    onClick = { contador2 = 0 },
                    modifier = Modifier.height(45.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Icon(
                        imageVector = Icons.Filled.RestartAlt,
                        contentDescription = "Mas",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Resetear", fontSize = 18.sp, color = Color.White)
                }
            }
        }
    }
}