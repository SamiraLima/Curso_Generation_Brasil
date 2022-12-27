fun main(){

    while(true) {
                println("1- Armazenar produto")
                println("2- Remover produto")
                println ("3- Atualizar produto")
                println ("4- Exibir todos os produto")
                println ("5- Sair")

                println("")

                println ("Escolha uma das opções: ")

            val produto = Funcoes_Estoque()
            when(readln().toInt()){

            1 -> produto.armazenarP()
            2 -> produto.removerP()
            3 -> produto.atualizarP()
            4 -> produto.exibirP()
            5 -> break
            else -> print("Opção invalída")
        }
    }
}