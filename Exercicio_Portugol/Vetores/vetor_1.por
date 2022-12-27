programa
{
	
	funcao inicio()
	{
		
		real Maiornota, numero[5]

		para(inteiro i=0; i <= 4; i++){

			escreva("Digite a ", i+1, " nota: ")
			leia(numero[i])

		} 

		Maiornota = numero[0]
		
		para(inteiro i=0; i<=4; i++){

			se(numero[i] > Maiornota){
				Maiornota = numero[i]
			}
		}

		escreva("O maior número é: ",Maiornota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */