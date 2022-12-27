package com.generation.telasdesenvolvmed.model

data class Comentario (
    val id : Long,
    var conteudo : String,
    val data : String,
    val postagem : Postagem,
    val cadastro : Cadastro
        ){

}