fun main(){

    var num = 0
    var numTotal = 0
    var mult3 = 0
    do{
        println("Digite um número: ")
        num = readln().toInt()

        if (num % 3 ==0 && num !=0){
            mult3 += num
            numTotal++
        }

    }while(num!=0)

    println("A média dos números multiplos de 3 é: ${mult3/numTotal}")

}