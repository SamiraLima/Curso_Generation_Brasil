package com.generation.telasdesenvolvmed.model

class PacienteCadastro(
    val id: Long,
    val cpf: String,
    val nome: String,
    val sobrenome: String,
    val senha: String,
    val email: String,
    val convenio: String
) {
}