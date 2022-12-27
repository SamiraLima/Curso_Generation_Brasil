import cadastro.*

val listaCadastros = mutableListOf<Cadastro>()

fun main(args: Array<String>) {

    while(true){
        try{
            while (true){
                println("(1) - Cadastrar...")
                println("(2) - Listar Usuarios")
                println("(3) - Listar Postagens")
                println("(4) - Criar postagem")
                println("(5) - Deletar postagem")
                println("(6) - Adicionar Comentario")
                println("(0) - Sair")
                print("Digite: ")

                when(readln().toInt()){
                    1 -> {
                        cadastroUsuario()
                    }
                    2 -> {
                        println("Listando Cadastros...")
                        listaCadastros.forEach{ cadastro ->
                            println(cadastro)
                        }
                    }
                    3 -> {
                        println("Listando Postagens...")
                        println(Postagens.listarPostagens())
                    }
                    4 -> {
                        println("Criando postagens!")
                        criandoPosts()
                    }
                    5 -> {
                        println("Deletando posts...")
                        deletaPostagens()
                    }
                    6 -> {
                        println("Adicionando comentarios!")
                        addComentario()
                    }
                    0 -> {
                        println("Obrigado por utilizar!")
                        break
                    }
                    else -> {
                        println("Opção Inválida!")
                    }
                }

            }
            break
        }catch (e: Exception){
            println(e.message)
        }
    }
}

fun addComentario() {
    print("Insira o nome de quem irá comentar: ")
    val nome = readln()

    for(cadastro in listaCadastros){
        if(cadastro.pegaNome() == nome && cadastro is CadastroUsuario){
            print("Informe o comentario: ")
            val comentario = readln()

            print("Informe o id do post que quer comentar: ")
            val id = readln().toInt()
            println(cadastro.adicionarComentario(id,comentario))

        }
    }
}

fun deletaPostagens() {
    print("Digite o nome do responsavel por este post: ")
    val resp = readln()
    try{
        for(cadastro in listaCadastros){
            if(cadastro.pegaNome() == resp && cadastro is CadastroMedico){

                print("Digite o id do post que será deletado: ")
                val id = readln().toInt()

                if(Postagens.postagens.get(id-1).contains(resp)){

                    println(cadastro.deletarPostagem(id-1))
                    break
                }

                println("Post não pertence a este médico!")
                break

            } else if(cadastro.pegaNome() == resp && cadastro is CadastroEstabelecimento){
                print("Digite o id do post que será deletado: ")
                val id = readln().toInt()

                if(Postagens.postagens.get(id-1).contains(resp)){
                    println(cadastro.deletarPostagem(id-1))
                    break
                }

                println("Post não pertence ao seu estabelecimento!")
                break
            }
        }

    }catch (e: Exception){
        println("id da postagem nao encontrado")
    }

}

fun cadastroUsuario(){
    print("Informe o nome: ")
    val nome = readln()
    print("Informe o login: ")
    val login = readln()
    print("Informe o senha: ")
    val senha = readln()
    print("Informe o telefone: ")
    val telefone = readln()

    println("Informe o tipo de cadastro: (1) Paciente (2) Medico (3) Estabelecimento")
    val opcao = readln().toInt()

    if(opcao == 1){
        print("informe o cpf: ")
        val cpf = readln()
        val cadastro = CadastroUsuario(nome, login, senha, telefone, cpf)
        listaCadastros.add(cadastro)
    }
    else if(opcao == 2){
        print("informe o cpf: ")
        val cpf = readln()
        print("informe o crm: ")
        val crm = readln()
        val cadastro = CadastroMedico(nome, login, senha, telefone, cpf, crm)
        listaCadastros.add(cadastro)
    }
    else if(opcao == 3){
        print("informe o cnpj: ")
        val cnpj = readln()
        val cadastro = CadastroEstabelecimento(nome, login, senha, telefone, cnpj)
        listaCadastros.add(cadastro)
    }
    else {
        println("Opção Invalida!")
    }
}

fun criandoPosts(){
    print("Informe seu nome: ")
    val nome = readln()

    for(cadastro in listaCadastros){
        if( cadastro.pegaNome() == nome && cadastro is CadastroMedico){
            println("Olá doutor(a) ${cadastro.pegaNome()}")
            print("Insira sua postagem: ")
            val post = readln()
            println(cadastro.criarPostagem(post))
            break
        }
        else if( cadastro.pegaNome() == nome && cadastro is CadastroEstabelecimento){
            println("Olá estabelecimento ${cadastro.pegaNome()}")
            print("Insira sua postagem: ")
            val post = readln()
            println(cadastro.criarPostagem(post))
            break
        }
    }
}