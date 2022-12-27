package Estrutura_Condicional

import java.util.Scanner

fun main(){
    var numero : Int
    val scanner = Scanner(System.`in`)

    println("Digite um número: ")
    numero = scanner.nextInt()

    if(numero % 2==0){
        println("Esse numero é par.")
    }

    else{
        println("Esse numero é Ímpar.")
    }

    if(numero < 0){
        println("\nEsse numero é Negativo.")
    }

    if(numero > 0){
        println("Esse numero é Positivo.")
    }

    if(numero == 0){
        println("Esse numero é Neutro.")
    }
}