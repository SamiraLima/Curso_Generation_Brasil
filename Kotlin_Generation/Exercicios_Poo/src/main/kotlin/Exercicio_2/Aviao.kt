package Exercicio_2

class Aviao(
    val cor: String,
    val quantPessoas: Int,
    val destino: String){

    var desistencia = ""
    var trocaVoo = ""

    constructor(
        cor: String,
        quantPessoas: Int,
        destino: String,
        desistencia: String,
        trocaVoo: String
    ): this(cor,quantPessoas, destino){
        this.desistencia = desistencia
        this.trocaVoo = trocaVoo
    }

    fun cancelarVoo(desistencia: String){
        if (desistencia == "s"){
            println("Voo cancelado")
        }else if (desistencia == "n"){
            println("Voo não cancelado")
        }
    }

    fun trocarVoo(destino: String){
        if (destino == "s"){
            println("Voo trocado")
        }else if (destino == "n"){
            println("Voo não trocado")
        }
    }
}