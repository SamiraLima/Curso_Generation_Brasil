package cadastro

class CadastroMedico(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    val cpf: String,
    val crm: String
) : Cadastro(nome, login, senha, telefone) {



    init{
        if(cpf.length == 11 && crm.length == 8){
            if(cpf !in BancoDeInformacoes.cpfsCadastrados && crm !in BancoDeInformacoes.crmCadastrados){
                println("Medico $nome cadastrado com sucesso")
                BancoDeInformacoes.cpfsCadastrados.add(cpf)
                BancoDeInformacoes.crmCadastrados.add(crm)
            } else if(cpf !in BancoDeInformacoes.cpfsCadastrados && crm in BancoDeInformacoes.crmCadastrados){
                throw IllegalArgumentException ("Cadastro Inválido! - CRM já no sistema")
            }else if(cpf in BancoDeInformacoes.cpfsCadastrados && crm !in BancoDeInformacoes.crmCadastrados){
                throw IllegalArgumentException ("Cadastro Inválido! - CPF já no sistema")
            } else{
                throw IllegalArgumentException ("Cadastro Inválido! - CPF e CRM já no sistema")
            }

        } else {
            throw IllegalArgumentException ("Cadastro Inválido!")
        }

    }

    /*
    companion object{

        //val postagens = mutableListOf<String>()
        //private val crmMedicosCadastrados = mutableSetOf<String>()

        /*
        fun listarPostagens():String{
            var posts = ""
            var id = 1
            for(postagem in Postagens.postagens){
                posts += "id: ${id} - "+ postagem + "\n"
                id++
            }
            return posts
        }
         */

    }
    */

    fun criarPostagem(post: String):String{
        var postagem = "Médico(a) $nome postou:\n"
        postagem += post
        if(post.isNotBlank()){
            Postagens.postagens.add(postagem)
            return "Post de $nome Criado com sucesso"
        }
        return "O post nao pode estar em branco"
    }

    fun deletarPostagem(postDeletado: Int): String?{

        if(Postagens.postagens.contains(Postagens.postagens.get(postDeletado))){

            Postagens.postagens.removeAt(postDeletado)
            return "Post deletado com sucesso"
        }
        return ""
    }

    /*
    fun editarPostagem(id: Int){
        for (postagem in postagens){
            if(postagens.indexOf(postagem) == id){
                print("Digite o novo post: ")
                var novaPostagem = readln()
                novaPostagem += "(editado)"
                //postagens.add(novaPostagem)
                postagens.remove(postagem)
                this.criarPostagem(novaPostagem)
                break
            }
        }
    }
    */

    override fun toString(): String {
        var retorno = "Médico: $nome, Crm: $crm "

        return retorno
    }

}