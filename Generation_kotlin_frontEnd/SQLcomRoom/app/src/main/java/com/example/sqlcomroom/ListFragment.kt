package com.example.sqlcomroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sqlcomroom.adapter.UserAdapter
import com.example.sqlcomroom.databinding.FragmentListBinding

class ListFragment: Fragment(){

    private lateinit var binding: FragmentListBinding
    private  lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(layoutInflater, container, false)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val adapter = UserAdapter()
        binding.recyclerUser.layoutManager = LinearLayoutManager(context)
        binding.recyclerUser.adapter = adapter
        binding.recyclerUser.setHasFixedSize(true)

        mainViewModel.selectUsers.observe(viewLifecycleOwner){
            response -> adapter.setList(response)
        }

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        return binding.root


    }

}