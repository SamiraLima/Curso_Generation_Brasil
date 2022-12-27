programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n= 0.0, soma=0.0, media=0.0, nLidos =0.0

		enquanto(n >= 0 ){
			escreva("Digite um numero: ")
			leia(n)

			se(n >= 0){
			nLidos++
			soma += n
			media = soma / nLidos
			}
		}
		limpa()
	
		escreva("A somatória de todos os números foi: ", soma)
		escreva("\nA média dos números foi: ", Matematica.arredondar(media, 2))
		escreva("\nA quantidade de números digitados foi: ", nLidos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n, 7, 7, 1}-{soma, 7, 15, 4}-{media, 7, 25, 5}-{nLidos, 7, 36, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */