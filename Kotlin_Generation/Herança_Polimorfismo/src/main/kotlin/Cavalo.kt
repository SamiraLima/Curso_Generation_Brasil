class Cavalo(
    nome:String,
    idade: Int
): Animal(nome, idade) {

    override fun emitirSom() {
        println("Potócó")
    }
}