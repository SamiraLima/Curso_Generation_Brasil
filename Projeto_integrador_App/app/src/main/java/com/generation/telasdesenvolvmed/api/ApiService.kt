package com.generation.telasdesenvolvmed.api

import com.generation.telasdesenvolvmed.model.*
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET("tema")
    suspend fun listTema(): Response<List<Tema>>

    @GET("postagem")
    suspend fun listPostagem(): Response<List<Postagem>>

    @POST("postagem")
    suspend fun addPostagem(
        @Body postagem: Postagem
    ): Response<Postagem>

    @GET("comentario")
    suspend fun listComentario(): Response<List<Comentario>>

    @POST("comentario")
    suspend fun addComentario(
        @Body comentario: Comentario
    ): Response<Comentario>

    @GET("paciente/busca-email/{email}")
    suspend fun getCadastroPacienteByEmail(@Path("email") email: String): Response<Paciente>

    @GET("medico/busca-email/{email}")
    suspend fun getCadastroMedicoByEmail(@Path("email") email: String): Response<Medico>

    @GET("cadastro/busca-email/{email}")
    suspend fun getCadastroByEmail(@Path("email") email: String): Response<Cadastro>

    @POST("cadastro/paciente")
    suspend fun addPaciente(
        @Body paciente: PacienteCadastro
    ): Response<PacienteCadastro>

    @POST("cadastro/medico")
    suspend fun addMedico(
        @Body medico: MedicoCadastro
    ): Response<MedicoCadastro>

    @PUT("cadastro/paciente")
    suspend fun attPaciente(
        @Body paciente: PacienteCadastro
    ): Response<PacienteCadastro>

    @PUT("cadastro/medico")
    suspend fun attMedico(
        @Body medico: MedicoCadastro
    ): Response<MedicoCadastro>

}