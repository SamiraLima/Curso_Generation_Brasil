package com.generation.telasdesenvolvmed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.generation.telasdesenvolvmed.databinding.FragmentPerfilMedicoBinding
import com.generation.telasdesenvolvmed.databinding.FragmentPostBinding

class PerfilMedicoFragment : Fragment(){

    private lateinit var binding: FragmentPerfilMedicoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentPerfilMedicoBinding.inflate(layoutInflater, container, false)

       return binding.root
    }
}