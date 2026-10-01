package com.example.miapp.views

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.miapp.modeView.ContadorViewMode

@Composable
fun ContadorView(view : ContadorViewMode){
    Box(
        contentAlignment = Alignment.Center
    ){
        Text(text = view.contador.value.toString(),
            fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }
}