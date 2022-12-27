fun main(){

    var totalPar =0
    var totalImpar = 0

    for(i in 1..10){
        println("Digite um numero: ")
        val num = readln().toInt()

        if(num % 2==0){
            totalPar++
        }else{
            totalImpar++
        }
    }

    println("O total de números pares digitados foi: $totalPar")
    println("O total de números pares digitados foi: $totalImpar")


}