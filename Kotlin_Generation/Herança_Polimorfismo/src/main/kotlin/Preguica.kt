class Preguica(
     nome: String,
     idade: Int,
): Animal(nome, idade) {

    override fun emitirSom() {
        println("Som de preguiça")
    }

    override fun locomocao() {
        println("Escalar arvores")
    }
}