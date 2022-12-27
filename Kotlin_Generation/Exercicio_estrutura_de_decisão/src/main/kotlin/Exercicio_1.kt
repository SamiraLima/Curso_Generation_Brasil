fun main(){

    print("Digite o primeiro número: ")
    val n1 = readln().toInt()

    print("Digite o segundo número: ")
    val n2 = readln().toInt()

    print("Digite o terceiro número: ")
    val n3 = readln().toInt()

    if( n1 >= n2 && n1 >= n3){
        print("O maior número digitado foi $n1")
    }else if (n2 >= n1 && n2 >= n3){
        print("O maior número digitado foi $n2")
    }else{
        print("O maior número digitado foi $n3")
    }
}