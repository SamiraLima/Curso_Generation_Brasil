fun main(){

    var soma = 0
    do{
        print("Digite um número: ")
        val num = readln().toInt()

        if(num > 0 || num < 0){
            soma += num
        }
    }while(num!=0)

    print("A soma de todos os números digitados foi: $soma")
}