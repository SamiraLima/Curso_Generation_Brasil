package Exercicio_2

fun main(){

    println("Digite a cor do avião: ")
    val cor = readln()

    println("Digite o número de passageiros: ")
    val quantPessoas = readln().toInt()

    println("Digite o local de destino da viagem: ")
    val destino = readln()

    println("Deseja cancelar o voo?: (s/n)")
    val desistencia = readln()

    println("Deseja trocar o voo?: (s/n)")
    val trocaVoo = readln()

    val aviao1 = Aviao(
        cor, quantPessoas, destino, desistencia, trocaVoo
    )

    aviao1.cancelarVoo(desistencia)
    aviao1.trocarVoo(trocaVoo)

}