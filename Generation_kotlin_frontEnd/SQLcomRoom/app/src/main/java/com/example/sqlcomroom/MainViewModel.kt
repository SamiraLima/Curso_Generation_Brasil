package com.example.sqlcomroom

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sqlcomroom.date.UserDatabase
import com.example.sqlcomroom.date.UserRepository
import com.example.sqlcomroom.date.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel (application : Application) : AndroidViewModel(application){

    val selectUsers: LiveData<List<Usuario>>
    val repository: UserRepository

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        selectUsers = repository.selectUsers
    }

    fun userAdd(usuario: Usuario){

        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(usuario)
        }

    }

}
