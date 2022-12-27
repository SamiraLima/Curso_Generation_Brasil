import kotlin.math.*
fun main(){
    print("Digite o diâmetro do circulo: ")
    val diametro = readln().toDouble()

    val area = PI * (diametro/2).pow(2)
    val perimetro = 2 * PI * (diametro/2)

    println("Perimetro do Círculo: $perimetro")
    println("Área do Círculo: $area")
}