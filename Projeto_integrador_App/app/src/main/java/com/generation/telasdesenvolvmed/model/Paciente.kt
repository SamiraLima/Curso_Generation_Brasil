package com.generation.telasdesenvolvmed.model

data class Paciente(
    val id: Long,
    var convenio: String,
    val cadastro: Cadastro
) {
}