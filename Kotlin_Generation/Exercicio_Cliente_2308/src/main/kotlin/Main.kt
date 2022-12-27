fun main() {


        try {
            print("Digite seu nome: ")
            val nome = readln().toString()

            print("Digite seu endereco: ")
            val endereco = readln().toString()

            print("Digite seu telefone: ")
            val telefone = readln().toString()


            val cliente = Cliente(nome, endereco, telefone)

            while (true){
                println("Escolha uma das opções: ")
                println("1 - Adicionar item")
                println("2 - Remover item")
                println("3 - Listar itens")
                println("4 - Sair")
                var opc = readln().toInt()

                when(opc){
                    1 -> {
                        print("Digite o item que deseja adicionar: ")
                        val item = readln()
                        cliente.addItem(item)
                    }
                    2 -> {
                        print("Digite o item que deseja remover: ")
                        val item = readln()
                        cliente.removeItem(item)
                    }
                    3 -> cliente.listarItem()
                    4 -> break
                    else -> print("Opção inválida")
                }
            }

        }catch(e: Exception){
            println(e.message)

    }
}