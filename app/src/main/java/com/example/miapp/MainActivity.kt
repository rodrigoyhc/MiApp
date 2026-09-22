package com.example.miapp

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter.State.Empty.painter
import com.example.miapp.navigation.Navigate
import com.example.miapp.ui.theme.MiAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Navigate()
                }
            }
        }
    }
}

@Composable
fun Contenido(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonNormal()
        Espacio()
        BotonNormal2()
        Espacio()
        BotonTexto()
        Espacio()
        BotonOutLine()
        Espacio()
        BotonIcono()
        Espacio()
        BotonFlotante()
    }
}

@Composable
fun Espacio(){
    Spacer(modifier = Modifier.size(10.dp))
}

@Composable
fun BotonNormal(){
    Button(onClick = {}) {
        Text("Mi Boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonNormal2(){
    Button(onClick = {}, enabled = false) {
        Text("Mi Boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonTexto(){
    TextButton(onClick = {}) {
        Text("Mi Boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonOutLine(){
    OutlinedButton(onClick = {}, border = BorderStroke(3.dp, Color.Red)) {
        Text("Mi Boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonIcono(){
    IconButton(onClick = {}) {
        Icon(
            painter = painterResource(R.drawable.unnamed),
            contentDescription = ""
        )
    }
}

@Composable
fun BotonFlotante(){
    FloatingActionButton(onClick = {},
        containerColor = Color.Red,
        contentColor = Color.Blue,
        shape = CircleShape) {
        Icon(
            painter = painterResource(R.drawable.unnamed),
            contentDescription = "",
            modifier = Modifier.size(30.dp)
        )
    }
}