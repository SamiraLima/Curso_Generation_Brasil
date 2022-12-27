import { Animal } from "./animal";

export class Preguica extends Animal{

    constructor(
        nome: string,
        idade: number
    ){
        super(nome, idade)
    }

    emitirSom(): void {
        console.log("Som de preguiça")
    }

    locomocao(): void {
        console.log("Escalar arvores")
    }
}