fun main(){

    print("Digite uma idade: ")
    val idade = readln().toInt()

    when(idade){
        in 10..14 -> print("Essa idade está na categoria infantil.")
        in 15..17 -> print("Essa idade está na categoria juvenil.")
        in 18..25 -> print("Essa idade está na categoria adulto.")
        else -> print("Idade não aceita. Digite uma idade de 10 a 25")
    }
}