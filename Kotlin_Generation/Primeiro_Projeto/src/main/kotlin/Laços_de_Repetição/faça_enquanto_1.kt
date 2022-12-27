package Laços_de_Repetição

fun main(){
    var i : Int = 233

    do{

        if(i >= 300 && i <= 400){
            i+=3
            println("entre 300 e 400:" + i)
        }else{
            i+=5
            println(i)
        }

    }while(i < 456)
}