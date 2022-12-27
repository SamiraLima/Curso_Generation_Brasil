fun main() {

    val cachorro = Cachorro(
        "snow",
        9
    )

    val cavalo = Cavalo(
        "Pé de pano",
        10
    )

    val preguica = Preguica(
        "Flash",
        4
    )

    cachorro.emitirSom()
    cavalo.emitirSom()
    preguica.emitirSom()
}