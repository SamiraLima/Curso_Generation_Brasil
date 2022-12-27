package Laços_de_Repetição

import java.util.Scanner

fun main(){
    var numero : Int
    val scanner = Scanner(System.`in`)

    println("Digite um número: ")
    numero = scanner.nextInt()

    println(numero)
    while(numero < 100){
        numero = numero * 3
        println(numero)
    }
}