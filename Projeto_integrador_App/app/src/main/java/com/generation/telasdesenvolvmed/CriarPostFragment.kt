package com.generation.telasdesenvolvmed

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.generation.telasdesenvolvmed.databinding.FragmentCriarPostBinding
import com.generation.telasdesenvolvmed.model.Cadastro
import com.generation.telasdesenvolvmed.model.Medico
import com.generation.telasdesenvolvmed.model.Postagem
import com.generation.telasdesenvolvmed.model.Tema
import java.time.LocalDateTime

class CriarPostFragment : Fragment() {

	private lateinit var binding: FragmentCriarPostBinding
	private val mainViewModel: MainViewModel by activityViewModels()
	private var temaSelecionado = 0L

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		binding = FragmentCriarPostBinding.inflate(layoutInflater, container, false)

		//binding.dmToolbar.toolbarImg.drawable

		mainViewModel.listTema()

		mainViewModel.myTemaResponse.observe(viewLifecycleOwner) { response ->
			Log.d("Requisicao", response.body().toString())
			spinnerTema(response.body()!!)
		}

		binding.botaoPublicar.setOnClickListener {
			inserirNoBanco()
		}

		return binding.root
	}

	private fun spinnerTema(listaTema: List<Tema>) {

		if (listaTema.isEmpty())
			throw IllegalArgumentException("Lista vazia!")

		binding.selecTemas.adapter =
			ArrayAdapter(
				requireContext(),
				androidx.transition.R.layout.support_simple_spinner_dropdown_item,
				listaTema
			)

		binding.selecTemas.onItemSelectedListener =
			object : AdapterView.OnItemSelectedListener {
				override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
					val selected = binding.selecTemas.selectedItem as Tema

					temaSelecionado = selected.id
				}

				override fun onNothingSelected(p0: AdapterView<*>?) {

				}
			}
	}

	private fun validarCampos(titulo: String, conteudo: String, anexo: String): Boolean {
		return (
				(titulo.isNotBlank() && titulo.length in 20..255) &&
						(conteudo.isNotBlank() && conteudo.length in 20..5000) &&
						(anexo.isNotBlank() && anexo.length in 10..500)
				)
	}

	private fun inserirNoBanco() {

		val titulo = binding.tituloText.text.toString()
		val conteudo = binding.postText.text.toString()
		val anexo = binding.textAnexo.text.toString()
		//val medico = binding.currentUser.medico.id
		val medico = Medico(
			1, null, null, null
		)
		val dataPostagem = LocalDateTime.now().toString()
		val tema = Tema(temaSelecionado, null, null)

		if (validarCampos(titulo, conteudo, anexo)) {

			val postagem = Postagem(0, titulo, conteudo, anexo, dataPostagem, tema, medico)
			mainViewModel.addPostagem(postagem)
			Toast.makeText(context, "Postagem criada!", Toast.LENGTH_SHORT).show()
			findNavController().navigate(R.id.action_criarPostFragment_to_postFragment)

		} else {
			Toast.makeText(context, "Verifique os campos!", Toast.LENGTH_SHORT).show()
		}
	}
}