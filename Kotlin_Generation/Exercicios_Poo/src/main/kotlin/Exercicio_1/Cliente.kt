package Exercicio_1

class Cliente (
    var nome: String,
    var produto: String,
    var modoPagar: Int
    ){

    var desconto = ""

    constructor(
        nome: String,
        produto: String,
        modoPagar: Int,
        desconto: String
    ): this(nome, produto, modoPagar){
        this.desconto = desconto
    }

    fun escolhaPagar(modoPagar: Int){
        if (modoPagar == 1){
            println("A modalidade de pagamento escolhida foi débito.")
        }else if (modoPagar == 2){
            println("A modalidade de pagamento escolhida foi crédito.")
        }else{
            println("A modalidade de pagamento escolhida inválida")
        }
    }

    fun opcaoDesconto(desconto: String){
        if (desconto == "s"){
            println("Desconto adicionado com sucesso.")
        }else if (desconto == "n"){
            println("Desconto negado.")
        }
    }



}