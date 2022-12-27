fun main(){

    var menos21 = 0
    var mais50 = 0
    var idade = 0
    while (idade != -99){

        println("Digite uma idade: ")
        idade = readln().toInt()

        if (idade < 21){
            menos21++
        }else if(idade >= 50){
            mais50++
        }
    }

    println("O número de pessas que tem menos de 21 anos é $menos21")
    println("O número de pessas que tem mais de 50 anos é $mais50")
}