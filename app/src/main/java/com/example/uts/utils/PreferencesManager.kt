package com.example.uts.utils

import android.content.Context
import android.content.SharedPreferences

object PreferencesManager {
    private const val PREFS_NAME = "user_prefs"
    private const val KEY_IS_LOGGED_IN = "is_logged_in"
    private const val KEY_EMAIL = "email"
    private const val KEY_NIM = "nim"
    private const val KEY_NAMA = "nama"
    private const val KEY_KELAS = "kelas"

    private fun getPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun setLoggedIn(context: Context, isLoggedIn: Boolean) {
        val editor = getPreferences(context).edit()
        editor.putBoolean(KEY_IS_LOGGED_IN, isLoggedIn)
        editor.apply()
    }

    fun isLoggedIn(context: Context): Boolean {
        return getPreferences(context).getBoolean(KEY_IS_LOGGED_IN, false)
    }

    fun clearLoginState(context: Context) {
        val editor = getPreferences(context).edit()
        editor.remove(KEY_IS_LOGGED_IN)
        editor.apply()
    }

    fun setUserData(context: Context, email: String, nim: String, nama: String, kelas: String) {
        val editor = getPreferences(context).edit()
        editor.putString(KEY_EMAIL, email)
        editor.putString(KEY_NIM, nim)
        editor.putString(KEY_NAMA, nama)
        editor.putString(KEY_KELAS, kelas)
        editor.apply()
    }

    fun getUserData(context: Context): Map<String, String?> {
        val prefs = getPreferences(context)
        return mapOf(
            KEY_EMAIL to prefs.getString(KEY_EMAIL, null),
            KEY_NIM to prefs.getString(KEY_NIM, null),
            KEY_NAMA to prefs.getString(KEY_NAMA, null),
            KEY_KELAS to prefs.getString(KEY_KELAS, null)
        )
    }
}
