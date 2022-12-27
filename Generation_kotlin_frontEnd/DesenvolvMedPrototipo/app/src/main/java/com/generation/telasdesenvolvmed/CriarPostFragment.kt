package com.generation.telasdesenvolvmed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generation.telasdesenvolvmed.databinding.FragmentCriarPostBinding

class CriarPostFragment : Fragment() {

    private lateinit var binding: FragmentCriarPostBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCriarPostBinding.inflate(layoutInflater, container, false)

        //binding.dmToolbar.toolbarImg.drawable

        binding.botaoPublicar.setOnClickListener{
            findNavController().navigate(R.id.action_criarPostFragment_to_postFragment)
        }

        return binding.root
    }


}