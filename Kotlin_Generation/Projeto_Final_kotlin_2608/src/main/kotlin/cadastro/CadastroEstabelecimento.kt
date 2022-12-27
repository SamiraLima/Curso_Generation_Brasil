package cadastro

class CadastroEstabelecimento(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    private val cnpj: String
) : Cadastro(nome, login, senha, telefone) {


    init{
        if(cnpj.length == 14){
            if(cnpj !in BancoDeInformacoes.cnpjsCadastrados){
                println("Estabelecimento $nome cadastrado com sucesso")
                BancoDeInformacoes.cnpjsCadastrados.add(cnpj)
            } else{
                throw IllegalArgumentException ("CNPJ Já Cadastrado no sistema!")
            }
        } else {
            throw IllegalArgumentException ("CNPJ Inválido!")
        }

    }

    fun criarPostagem(post: String):String{
        var postagem = "Estabelecimento $nome postou:\n"
        postagem += post
        if(post.isNotBlank()){

            Postagens.postagens.add(postagem)
            return "Post de $nome criado com sucesso"
        }
        return "O post nao pode estar em branco"
    }

    fun deletarPostagem(postDeletado: Int):String{
        if(Postagens.postagens.contains(Postagens.postagens.get(postDeletado))){
            Postagens.postagens.removeAt(postDeletado)
            return "Post id $postDeletado deletado com sucesso"
        }
        return "O Post id $postDeletado nao existe"
    }

    /*
    fun editarPostagem(id: Int){
        for (postagem in CadastroMedico.postagens){
            if(CadastroMedico.postagens.indexOf(postagem) == id){
                print("Digite o novo post: ")
                val novaPostagem = readln()
                CadastroMedico.postagens.add(novaPostagem)
                CadastroMedico.postagens.remove(postagem)
                break
            }
        }
    }
    */

    override fun toString(): String {
        var retorno = "Estabelecimento: $nome, CNPJ: $cnpj "
        return retorno
    }

}