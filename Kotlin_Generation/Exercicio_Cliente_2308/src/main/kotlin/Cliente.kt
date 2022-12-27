class Cliente (
     val nome: String,
     val endereco: String,
     val telefone: String,
    ){


    private val listaDeCompras = mutableListOf<String>()


    init {
        checarNome(nome)
    }

        fun addItem(item: String){
            if (item.isNotBlank()){
                listaDeCompras.add(item)
                print("Item adicionado com sucesso!")
            }else{
                print("Item inválido")
            }
        }

        fun removeItem(item: String){
            if (listaDeCompras.contains(item)){
                listaDeCompras.remove(item)
                print("Item removido com sucesso!")
            }else{
                print("Item não presente na lista de compra")
            }
        }

        fun listarItem(){
            print("**** Lista de Compra ****\n")
            listaDeCompras.forEach{
                println(it)
            }
        }

    private fun checarNome(nome: String){
        if (nome.isBlank()){
            throw Exception("Nome não informado corretamente.")
        }
    }
}