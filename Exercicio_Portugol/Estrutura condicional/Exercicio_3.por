programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real n1, n2, n3, n4, i

		escreva("Digite um número: ")
		leia(n1)
		
		escreva("Digite um número: ")
		leia(n2)
		
		escreva("Digite um número: ")
		leia(n3)
		
		escreva("Digite um número: ")
		leia(n4)

		n1 = Matematica.potencia(n1, 2.0)
		n2 = Matematica.potencia(n2, 2.0)
		n3 = Matematica.potencia(n3, 2.0)
		n4 = Matematica.potencia(n4, 2.0)

		se(n3 >=1000){
			escreva("O quadrado do terceiro numero é: ", n3)
		}senao{
			escreva("O quadrado dos números que foram digitados são: ","\n", n1 ,"\n", n2 ,"\n", n3 ,"\n", n4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 595; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */