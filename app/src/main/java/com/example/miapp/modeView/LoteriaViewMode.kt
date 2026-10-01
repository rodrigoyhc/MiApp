package com.example.miapp.modeView

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State

class LoteriaViewMode: ViewModel(){
    private val _loteriaNumbers = mutableStateOf(emptyList<Int>())
    val loteriaNombers : State<List<Int>> = _loteriaNumbers

    fun generadorNumeros(){
        _loteriaNumbers.value = (1..60).shuffled().take(6).sorted()
    }
}