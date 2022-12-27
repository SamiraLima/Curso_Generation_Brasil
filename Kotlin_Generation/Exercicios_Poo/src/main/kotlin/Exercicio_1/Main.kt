package Exercicio_1

import java.nio.charset.Charset

fun main(){

    println("Digite seu nome: ")
    var nome = readln()

    println("Digite o nome do produto desejado: ")
    var produto = readln()

    println("Escolha um modo de pagamento: ")
    println("1 - Débito")
    println("2 - Crédito")
    var modoPagar = readln().toInt()

    println("Deseja receber um deconto: (s/n)")
    var desconto = readln()

    val cliente1 = Cliente(
        nome, produto, modoPagar, desconto
    )

    cliente1.escolhaPagar(modoPagar)
    cliente1.opcaoDesconto(desconto)
}