package cadastro

class CadastroUsuario(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    val cpf: String
) : Cadastro(nome, login, senha, telefone) {


    init{
        if(cpf.length == 11){
            if(cpf !in BancoDeInformacoes.cpfsCadastrados){
                println("Usuario $nome cadastrado com sucesso")
                BancoDeInformacoes.cpfsCadastrados.add(cpf)
            }
            else{
                throw IllegalArgumentException ("CPF Já cadastrado")
            }
        } else {
            throw IllegalArgumentException ("CPF Inválido!")
        }

    }

    override fun toString(): String {
        return "Usuário: $nome, Cpf $cpf"
    }


    fun adicionarComentario (id:Int, comentario:String):String{
        try{
            for(post in 0..Postagens.postagens.size){
                if(post == id-1){

                    var postmodificado = Postagens.postagens.get(post)
                    Postagens.postagens.removeAt(post)

                    postmodificado += "\ncomentario: $comentario - autor: $nome"
                    Postagens.postagens.add(postmodificado)
                    return "Comentario de $nome adicionado com sucesso!"
                }
            }
            return ""
        }catch (e: Exception){
            throw Exception ("Id do post não encontrado nas postagens")
        }
    }

}