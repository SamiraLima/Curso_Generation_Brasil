programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		se(numero % 2==0){
			escreva("Esse numero é par.")
		}

		senao{
			escreva("Esse numero é Ímpar.")
		}

		se(numero < 0){
			escreva("\nEsse numero é Negativo.")
		}

		se(numero > 0){
			escreva("\nEsse numero é Positivo.")
		}

		se(numero == 0){
			escreva("\nEsse numero é Neutro.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */