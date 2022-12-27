programa
{
	
	funcao inicio()
	{
		inteiro Qfilhos, PS100=0
		real salario, Mediasalario=0.0, soma=0.0, Maiorsalario=0.0, percentual=0.0, Mfilhos=0.0

		para(inteiro i=1; i <= 20 ; i++ ){

			limpa()
			escreva(i, " Habitante\n\n")

			escreva("Digite um salario: ")
			leia(salario)

			escreva("Digite o número de filhos: ")
			leia(Qfilhos)

			soma += salario
			Mfilhos += Qfilhos

			se(salario > Maiorsalario){
				Maiorsalario = salario
			}

			se(salario <= 100){
				PS100++
			}
		}
		
			Mediasalario = soma/20
			Mfilhos = Mfilhos/20
			percentual = (PS100 / 20.0) * 100

			limpa()

			escreva("Média do sálario da população: ", Mediasalario)
			escreva("\nMédia do número de filhos: ", Mfilhos)
			escreva("\nMaior sálario: ", Maiorsalario)
			escreva("\nPercentual de pessoas com salário até R$100,00: ", percentual, "%")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 854; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */