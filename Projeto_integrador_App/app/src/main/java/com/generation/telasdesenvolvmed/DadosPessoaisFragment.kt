package com.generation.telasdesenvolvmed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.generation.telasdesenvolvmed.databinding.FragmentDadosPessoaisBinding

class DadosPessoaisFragment : Fragment() {

    private lateinit var binding: FragmentDadosPessoaisBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentDadosPessoaisBinding.inflate(layoutInflater, container, false)

        return binding.root
    }
}