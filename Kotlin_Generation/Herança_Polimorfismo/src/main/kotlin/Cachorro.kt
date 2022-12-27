class Cachorro(
    nome: String,
    idade: Int
): Animal(nome, idade) {

    override fun emitirSom() {
        println("auau")
    }
}