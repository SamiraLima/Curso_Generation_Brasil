package com.generation.telasdesenvolvmed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generation.telasdesenvolvmed.databinding.FragmentTelaDeApresentacaoBinding

class tela_de_apresentacaoFragment : Fragment() {

    private lateinit var binding: FragmentTelaDeApresentacaoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTelaDeApresentacaoBinding.inflate(layoutInflater, container, false)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_tela_de_apresentacaoFragment_to_loginFragment)
        }

        return binding.root
    }


}