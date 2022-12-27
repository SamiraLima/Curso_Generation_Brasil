import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    var base : Double
    var altura : Double
    var area : Double

    println("Digite a base do triângulo: ")
    base = scanner.nextDouble()

    println("Digite a altura do triângulo: ")
    altura = scanner.nextDouble()

    if (base > 0 && altura > 0){
        println("Valores válidos.")
        area = (base * altura) / 2
        println("A área do triângulo é: " + area)
    }else{
        print("Números inválido, tente novamente.")
    }

}