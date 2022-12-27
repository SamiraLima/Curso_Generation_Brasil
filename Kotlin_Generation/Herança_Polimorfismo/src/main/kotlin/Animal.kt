abstract class Animal(
    val nome: String,
    var idade: Int,
) {
    abstract fun emitirSom()

    open fun locomocao(){
        println("Correndo")
    }
}