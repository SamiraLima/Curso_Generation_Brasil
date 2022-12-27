import { Animal } from "./src/animal";
import { Cachorro } from "./src/cachorro";
import { Cavalo } from "./src/cavalo";
import { Preguica } from "./src/preguica";




let cachorro = new Cachorro(
    "Snow",
    5
)

let cavalo = new Cavalo(
    "Pé de Pano",
    10
)

let preguica = new Preguica(
    "Flash",
    8
)

cachorro.emitirSom()

cavalo.emitirSom()

preguica.emitirSom()

preguica.locomocao()