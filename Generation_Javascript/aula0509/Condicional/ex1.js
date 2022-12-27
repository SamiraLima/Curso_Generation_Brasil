const prompt = require("prompt-sync")()

let n1 = Number(prompt("Digite o primeiro número: "))

let n2 = Number(prompt("Digite o segundo número: "))

let n3 = Number(prompt("Digite o terceiro número: "))

if(n1 > n2 && n1 > n3){
    console.log(`O maior número digitado foi ${n1}`)
}else if(n2 >= n1 && n2 >= n3){
    console.log(`O maior número digitado foi ${n2}`)
}else{
    console.log(`O maior número digitado foi ${n3}`)
}