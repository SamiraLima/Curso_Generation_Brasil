package com.example.todo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.databinding.CardLayoutBinding
import com.example.todo.model.Tarefa

class TarefaAdapter: RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switch1.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria.descricao

    }

    override fun getItemCount(): Int {
        return listTarefa.size
    }

    fun setLista(list: List<Tarefa>){
        listTarefa = list

        notifyDataSetChanged()
    }
}