import kotlin.math.*
fun main(){
    print("Digite um número inteiro: ")
    val num = readln().toInt()
    val numdouble = num.toDouble()

    if (num % 2 == 0){

        print("O número digitado é par.")
        print("A raíz quadrada desse número é ${"%.2f".format(sqrt(numdouble))}")
    }else{

        print("O número digitado é ímpar.")
        print("Esse número elevado ao quadrado é ${numdouble.pow(2)} ")
    }

}