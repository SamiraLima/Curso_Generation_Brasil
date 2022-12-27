const prompt = require("prompt-sync")()

let num = Number(prompt("Digite um número: "))

if(num % 2 == 0){
    console.log("\nO número digitado é par. \n")
    console.log(`A raíz quadrada desse número é ${Math.sqrt(num)}.`)
}else{
    console.log("\nO número digitado é ímpar. \n")
    console.log(`A raíz quadrada desse número é ${Math.pow(num,2)}.`)
}

