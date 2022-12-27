package com.generation.telasdesenvolvmed.model

class Cadastro (
    val id: Long,
    val cpf: String,
    val nome: String,
    val sobrenome: String,
    var senha: String,
    var email: String,
    val comentarios: List<Comentario>?
		){
}