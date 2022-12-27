package com.example.todo.api

import com.example.todo.model.Categoria
import retrofit2.Response

class Repository {

   suspend fun listCategoria(): Response<List<Categoria>>{
       return RetrofitInstance.api.listCategoria()
   }

}