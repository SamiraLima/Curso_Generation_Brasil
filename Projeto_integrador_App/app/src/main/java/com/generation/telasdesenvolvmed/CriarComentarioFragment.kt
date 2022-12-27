package com.generation.telasdesenvolvmed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.generation.telasdesenvolvmed.databinding.FragmentCriarComentarioBinding
import java.time.LocalDateTime

class CriarComentarioFragment : Fragment() {

	private lateinit var binding: FragmentCriarComentarioBinding
	private val mainViewModel: MainViewModel by activityViewModels()

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		binding = FragmentCriarComentarioBinding.inflate(layoutInflater, container, false)

		return binding.root
	}

	private fun validarCampos(conteudo: String): Boolean {
		return (
				(conteudo.isNotBlank() || conteudo.length in 10..300)
				)
	}

	/*private fun inserirNoBanco() {

		val conteudo = binding.editConteudo.text.toString()
		val data = LocalDateTime.now()
		val postagem = postagemId
		val cadastro = currentUser
	}*/
}