package com.example.todo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todo.api.Repository
import com.example.todo.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
    ): ViewModel() {


    private val _myCategoriaResponce =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponce : LiveData<Response<List<Categoria>>> =
        _myCategoriaResponce

    init {
        //listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch{
            try {
                val response = repository.listCategoria()
                _myCategoriaResponce.value = response


            }catch (e:Exception){
                Log.d("erro", e.message.toString())
            }
        }
    }

}