package com.generation.telasdesenvolvmed.model

data class Postagem(
    val id: Long,
    val titulo: String,
    val descricao: String,
    val anexo: String,
    val dataPostagem: String,
    val tema: Tema,
    val medico: Medico
) {

}