programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real codigo, nh, sal, exc=0.0, salExc=0.0

		escreva("Digite o código do funcionario: ")
		leia(codigo)

		escreva("Digite o número de horas trabalhadas do funcionario: ")
		leia(nh)

		exc = nh - 50

		se(exc > 0){
			
			sal = 50.0 *10.0
			salExc = exc * 20.0
			sal += salExc
			
		}senao{
			sal = nh *10.0
		}

		escreva("O salario total do funcionario é: ", mat.arredondar(sal, 2))
		escreva("\nO salario excedente do funcionario é: ", mat.arredondar(salExc, 2))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */