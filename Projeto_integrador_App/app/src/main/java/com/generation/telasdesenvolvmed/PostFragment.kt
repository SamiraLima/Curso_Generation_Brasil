package com.generation.telasdesenvolvmed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.telasdesenvolvmed.adapter.PostagemAdapter
import com.generation.telasdesenvolvmed.databinding.FragmentPostBinding
import com.generation.telasdesenvolvmed.model.*


class PostFragment : Fragment() {

	private lateinit var binding: FragmentPostBinding

	private val mainViewModel: MainViewModel by activityViewModels()

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?

	): View? {
		// Inflate the layout for this fragment

		binding = FragmentPostBinding.inflate(layoutInflater, container, false)

		mainViewModel.pacienteLogado.observe(viewLifecycleOwner) { response ->
			if (response.body() != null) {
				binding.addPostButton.visibility = View.INVISIBLE
			}
		}

		mainViewModel.listPostagem()

		binding.swipeToRefresh.setOnRefreshListener {
			mainViewModel.listPostagem()
		}

		val postagemAdapter = PostagemAdapter()
		binding.recyclerPostagem.layoutManager = LinearLayoutManager(context)
		binding.recyclerPostagem.adapter = postagemAdapter
		binding.recyclerPostagem.setHasFixedSize(true)

		binding.addPostButton.setOnClickListener {
			findNavController().navigate(R.id.action_postFragment_to_criarPostFragment)
		}

		binding.perfilButton.setOnClickListener {
			findNavController().navigate(R.id.action_postFragment_to_perfilMedicoFragment)
		}

		mainViewModel.myPostagemResponse.observe(viewLifecycleOwner) { response ->
			if (response.body() != null) {
				postagemAdapter.setList(response.body()!!)
				binding.swipeToRefresh.isRefreshing = false
			}
		}

		return binding.root
	}


}