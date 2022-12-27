package com.example.todo.api

import com.example.todo.util.Contantes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Contantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiServise by lazy {
        retrofit.create(ApiServise::class.java)
    }
}