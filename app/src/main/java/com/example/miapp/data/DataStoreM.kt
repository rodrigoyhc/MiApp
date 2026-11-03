package com.example.miapp.data

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(name = "user_preferences")

class DataStoreM(private val context: Context) {

    companion object {
        val IS_BOARDING_COMPLETED = booleanPreferencesKey("is_boarding_completed")
    }

    // Lee el estado guardado (por defecto false)
    val isBoardingCompleted: Flow<Boolean> = context.dataStore.data.map { preferences ->
        preferences[IS_BOARDING_COMPLETED] ?: false
    }

    // Guarda el estado en true al pulsar "Entrar"
    suspend fun saveBoardingState(completed: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_BOARDING_COMPLETED] = completed
        }
    }
}