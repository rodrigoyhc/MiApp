package com.example.miapp.modeView

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContadorViewMode: ViewModel(){
    private val _contador = mutableStateOf(0)
    val contador: State<Int> = _contador

    fun add(){
        _contador.value = _contador + 1;
    }
}