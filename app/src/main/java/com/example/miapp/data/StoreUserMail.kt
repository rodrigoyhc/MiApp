package com.example.miapp.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "User_Name")

class StoreUserMail(private val context: Context) {

    companion object {
        val USER_FULL_NAME = stringPreferencesKey("user_full_name")
        val USER_NAME = stringPreferencesKey("user_name")
        val USER_PASSWORD = stringPreferencesKey("user_password")
    }

    val getFullName: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[USER_FULL_NAME] ?: ""
    }

    val getUserName: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[USER_NAME] ?: ""
    }

    val getPassword: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[USER_PASSWORD] ?: ""
    }

    suspend fun saveUser(name: String, user: String, pass: String) {
        context.dataStore.edit { preferences ->
            preferences[USER_FULL_NAME] = name
            preferences[USER_NAME] = user
            preferences[USER_PASSWORD] = pass
        }
    }
}
