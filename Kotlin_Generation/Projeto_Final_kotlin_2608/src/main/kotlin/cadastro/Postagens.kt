package cadastro

class Postagens {

    companion object{
        val postagens = mutableListOf<String>()

        fun listarPostagens():String{
            var posts = ""
            var id = 1
            for(postagem in Postagens.postagens){
                posts += "id: ${id} - "+ postagem + "\n"
                id++
            }
            return posts
        }
    }

}