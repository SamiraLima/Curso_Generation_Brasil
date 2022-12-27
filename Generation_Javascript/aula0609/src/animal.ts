export abstract class Animal {

    private nome: string;
    private idade : number;
    
    constructor(
        nome: string,
        idade: number
    ){
        this.nome = nome
        this.idade = idade
    }

    abstract emitirSom(som : string) : void

    locomocao(){
        console.log("Correndo")
    }
}