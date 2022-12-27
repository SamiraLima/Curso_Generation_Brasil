package com.example.sqlcomroom

import android.os.Bundle
import android.os.TokenWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.sqlcomroom.databinding.FragmentAddBinding
import com.example.sqlcomroom.databinding.FragmentListBinding
import com.example.sqlcomroom.date.Usuario

class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private lateinit var mainViewModel : MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(layoutInflater, container, false)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.botaoAdd.setOnClickListener {
            inserirNoBanco()
        }

        return binding.root

    }

    fun verificarCampos(nome: String, sobrenome: String, idade: String): Boolean{
        return !(nome == "" || sobrenome == "" || idade == "")
    }

    fun inserirNoBanco(){
        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editIdade.text.toString()

        if(verificarCampos(nome, sobrenome, idade)){
            val user = Usuario(0, nome, sobrenome, idade.toInt())
            mainViewModel.userAdd(user)
            Toast.makeText(context, "Usuario adicionado", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }else{
            Toast.makeText(context, "Usuario não adicionado", Toast.LENGTH_LONG).show()
        }
    }
}