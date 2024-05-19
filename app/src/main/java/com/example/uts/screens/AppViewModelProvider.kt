package com.example.uts.screens

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.uts.AlumniApplication
import com.example.uts.screens.TambahAlumniViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Other Initializers
        // Initializer for ItemEntryViewModel
        initializer {
            TambahAlumniViewModel(alumniApplication().container.alumniRepository)
        }
        //...
    }
}

fun CreationExtras.alumniApplication(): AlumniApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AlumniApplication)
