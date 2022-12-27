programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite a idade: ")
		leia(idade)

		se(idade == 5 ou idade <= 7){
			escreva("Esse nadador esta na categoria Infantil A.")
		}

		senao se(idade < 7  ou idade <= 11){
			escreva("Esse nadador esta na categoria Infantil B.")

		}

		senao se(idade < 11  ou idade <= 13){
			escreva("Esse nadador esta na categoria Juvenil A.")

		}

		senao se(idade < 13  ou idade <= 17){
			escreva("Esse nadador esta na categoria Juvenil B.")

		}

		se(idade > 17){
			escreva("Esse nadador esta na categoria Adulto.")
		}
		
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 566; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */