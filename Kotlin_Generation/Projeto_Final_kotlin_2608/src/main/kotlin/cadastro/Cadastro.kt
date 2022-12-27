package cadastro

abstract class Cadastro(
    protected var nome: String,
    protected var login: String,
    protected var senha: String,
    protected var telefone: String
) {

    fun pegaNome():String{
        return nome
    }

}