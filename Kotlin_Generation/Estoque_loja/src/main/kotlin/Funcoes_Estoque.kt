 class Funcoes_Estoque {
    val _produtos = mutableListOf<String>()
    val listprodutos: List<String> = _produtos
     fun armazenarP(produto: String){

        print("Digite o nome do produto: ")
        val nome = readln()

        if(nome != ""){
            _produtos.add(nome)
            println("$nome armazenado com sucesso.")
        }else{
            println("Valor invalído")
        }

    }

    fun removerP(produto: String){

        while(true){
            print("Digite o nome do produto que deseja remover: ")
            val nome = readln()

            if(_produtos.contains(nome)){
                _produtos.remove(nome)
                println("$nome removido com sucesso.")
                break
            }else{
                println("O produto $nome não esta na lista.")
            }
        }
    }

    fun atualizarP(){
        print("Digite o nome do produto que deseja atualizar: ")
        val nome = readln()

        if (_produtos.contains(nome)){
            val posicao = _produtos.indexOf(nome)
            print("Digite o novo produto: ")
            _produtos[posicao] = readln()
            println("Produto atualizado com sucesso.")
        }else{
            println("O produto $nome não esta na lista.")
        }
    }

    fun exibirP(){
        println()
        println(_produtos)
    }
}