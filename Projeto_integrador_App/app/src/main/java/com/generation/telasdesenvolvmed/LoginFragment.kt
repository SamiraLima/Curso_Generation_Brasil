package com.generation.telasdesenvolvmed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generation.telasdesenvolvmed.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private val mainViewModel : MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)

        binding.buttonLogin.setOnClickListener {
            realizarLogin()
        }

        binding.buttonEsqueciSenha.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_esqueciSenhaFragment)
        }

        binding.buttonCadastro.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_cadastroFragment)
        }

        return binding.root
    }

    private fun validaLogin(email: String, senha: String): Boolean {
        return (
                (!email.isNullOrBlank() || email.length in 0..255) &&
                        (!senha.isNullOrBlank() || senha.length in 3..255)
                )
    }

    private fun realizarLogin() {

        val email = binding.textInputEmail.text.toString()
        val senha = binding.textInputSenha.text.toString()

        if (validaLogin(email, senha)) {

            //mainViewModel.getCadastroMedicoByEmail(email)
            //mainViewModel.getCadastroPacienteByEmail(email)
            mainViewModel.getCadastroByEmail(email)
            /*
            mainViewModel.medicoLogado.observe(viewLifecycleOwner) { response ->
                if (response.body() != null) {
                    if (senha == mainViewModel.medicoLogado.value?.body()?.cadastro?.senha.toString()) {
                        Toast.makeText(context, "Login de medico Bem Sucedido", Toast.LENGTH_SHORT)
                            .show()
                        findNavController().navigate(R.id.action_loginFragment_to_postFragment)
                    } else {
                        Toast.makeText(context, "Senha Incorreta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            mainViewModel.pacienteLogado.observe(viewLifecycleOwner) { response ->
                if (response.body() != null) {
                    if (senha == mainViewModel.pacienteLogado.value?.body()?.cadastro?.senha.toString()) {
                        Toast.makeText(
                            context,
                            "Login de paciente Bem Sucedido",
                            Toast.LENGTH_SHORT
                        ).show()
                        findNavController().navigate(R.id.action_loginFragment_to_postFragment)
                    } else {
                        Toast.makeText(context, "Senha Incorreta", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            */

            mainViewModel.cadastroVerificado.observe(viewLifecycleOwner) { response ->
                if (response.body() != null) {
                    if (senha == mainViewModel.cadastroVerificado.value?.body()?.senha.toString()) {
                        Toast.makeText(
                            context,
                            "Login Bem Sucedido",
                            Toast.LENGTH_SHORT
                        ).show()
                        findNavController().navigate(R.id.action_loginFragment_to_postFragment)
                    } else {
                        Toast.makeText(context, "Senha Incorreta", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        } else {
            Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
        }
    }
}