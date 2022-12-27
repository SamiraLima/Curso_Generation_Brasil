import { Animal } from "./animal";

export class Cachorro extends Animal{

    constructor(
        nome: string,
        idade: number
    ){
        super(nome, idade)
    }

    emitirSom(): void {
        console.log("AUAU")
    }
}