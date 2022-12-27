package com.example.todo.api

import com.example.todo.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiServise {

    @GET("categoria")
    suspend fun listCategoria() : Response<List<Categoria>>
}