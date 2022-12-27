package com.generation.telasdesenvolvmed.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.telasdesenvolvmed.databinding.CardLayoutBinding
import com.generation.telasdesenvolvmed.databinding.FragmentCriarPostBinding
import com.generation.telasdesenvolvmed.model.Postagem

class PostagemAdapter : RecyclerView.Adapter<PostagemAdapter.PostagemViewHolder>() {

    private var listPostagem = emptyList<Postagem>()

    class PostagemViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostagemViewHolder {
        return PostagemViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: PostagemViewHolder, position: Int) {
        val postagem = listPostagem[position]

        holder.binding.temaPost.text = postagem.tema
        holder.binding.nomeMedico.text = postagem.medico
        holder.binding.tituloPost.text = postagem.titulo
        holder.binding.conteudoPost.text = postagem.conteudo
        holder.binding.linkAnexo.text = postagem.anexo
    }

    override fun getItemCount(): Int {
        return listPostagem.size
    }

    fun setList(list : List<Postagem>){
        listPostagem = list
        notifyDataSetChanged()
    }

}