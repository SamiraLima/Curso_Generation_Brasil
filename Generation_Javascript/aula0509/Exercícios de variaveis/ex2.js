const prompt = require("prompt-sync")()

let diametro = Number(prompt("Digite o diâmetro do circulo: "))

let area = Number(Math.PI * Math.pow((diametro/2),2))

let perimetro = Number(2 * Math.PI * (diametro/2))

console.log(`\nPerimetro do Círculo: ${perimetro} \n`)
console.log(`Área do Círculo: ${area}`)
