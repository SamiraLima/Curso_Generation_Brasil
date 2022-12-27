package Laços_de_Repetição

fun main(){
     var  i : Int = 1
     var soma : Int =0

    for(i in i..500){

        if(i % 2!=0 && i % 3==0){

            soma += i
        }

    }

    print(soma)
}
