const prompt = require("prompt-sync")()


let idade = Number(prompt("Digite sua idade: "))

let ano = 2022 - idade

console.log(`Você nasceu no ano de ${ano}`)
