package com.generation.telasdesenvolvmed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import com.generation.telasdesenvolvmed.databinding.FragmentCadastroBinding
import com.generation.telasdesenvolvmed.model.MedicoCadastro
import com.generation.telasdesenvolvmed.model.PacienteCadastro
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class cadastroFragment : Fragment() {

    private lateinit var binding: FragmentCadastroBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCadastroBinding.inflate(layoutInflater, container, false)

        binding.voltarButton.setOnClickListener {
            findNavController().navigate(R.id.action_cadastroFragment_to_loginFragment)
        }

        binding.radioMedico.setOnClickListener {
            binding.inputExclusivo.text?.clear()
            binding.inputExclusivoLayout.visibility = View.VISIBLE
            binding.inputExclusivo.hint = "CRM"
            binding.buttonCadastrar.visibility = View.VISIBLE
        }

        binding.radioPaciente.setOnClickListener {
            binding.inputExclusivo.text?.clear()
            binding.inputExclusivoLayout.visibility = View.VISIBLE
            binding.inputExclusivo.hint = "Convenio (Opcional)"
            binding.buttonCadastrar.visibility = View.VISIBLE
        }

        binding.buttonCadastrar.setOnClickListener {
            if (binding.radioPaciente.isChecked) {
                cadastroPaciente()
            } else {
                cadastroMedico()
            }
        }

        return binding.root
    }

    private fun validarCampos(
        nome: String,
        cpf: String,
        sobrenome: String,
        email: String,
        senha: String,
        crm: String
    ): Boolean {

        return (
                (nome.isNotBlank() && nome.length in 1..255) &&
                        (cpf.isNotBlank() && cpf.length == 11) &&
                        (sobrenome.isNotBlank() && sobrenome.length in 1..255) &&
                        (email.isNotBlank() && email.length in 1..255) &&
                        (senha.isNotBlank() && senha.length in 1..255) &&
                        (crm.isNotBlank() && crm.length == 13)
                )
    }

    private fun cadastroMedico() {
        val nome = binding.tilNome.text.toString()
        val cpf = binding.tilCpf.text.toString()
        val sobrenome = binding.tilSobrenome.text.toString()
        var email = binding.tilEmail.text.toString()
        val senha = binding.tilSenha.text.toString()
        val crm = binding.inputExclusivo.text.toString()
        val confirmaSenha = binding.tilConfirmaSenha.text.toString()


        mainViewModel.getCadastro(email)
        var emailNovo = true

        mainViewModel.cadastroVerificado.observe(viewLifecycleOwner) { response ->
            if (response.body() != null) {
                emailNovo = false
            }
        }

        mainViewModel.viewModelScope.launch {
            delay(2000)
            if (validarCampos(
                    nome,
                    cpf,
                    sobrenome,
                    email,
                    senha,
                    crm
                ) && emailNovo && senha == confirmaSenha
            ) {
                mainViewModel.addMedico(
                    MedicoCadastro(0, cpf, nome, sobrenome, senha, email, crm),
                    email
                )
                findNavController().navigate(R.id.action_cadastroFragment_to_postFragment)
            } else if (!emailNovo) {
                emailNovo = true
                mainViewModel.getCadastro("")
                Toast.makeText(context, "E-mail já em uso...", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Verifique os campos!", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun validarCamposPaciente(nome: String, cpf: String, sobrenome: String, email: String, senha: String, convenio: String): Boolean {
        return (
                (nome.isNotBlank() && nome.length in 1..255) &&
                        (cpf.isNotBlank() && cpf.length == 11) &&
                        (sobrenome.isNotBlank() && sobrenome.length in 1..255) &&
                        (email.isNotBlank() && email.length in 1..255) &&
                        (senha.isNotBlank() && senha.length in 1..255) &&
                        (convenio.isEmpty() || convenio.length > 1)
                )
    }

    private fun cadastroPaciente() {
        val nome = binding.tilNome.text.toString()
        val cpf = binding.tilCpf.text.toString()
        val sobrenome = binding.tilSobrenome.text.toString()
        var email = binding.tilEmail.text.toString()
        val senha = binding.tilSenha.text.toString()
        val convenio = binding.inputExclusivo.text.toString()
        val confirmaSenha = binding.tilConfirmaSenha.text.toString()


        mainViewModel.getCadastro(email)
        var emailNovo = true

        mainViewModel.cadastroVerificado.observe(viewLifecycleOwner) { response ->
            if (response.body() != null) {
                emailNovo = false
            }
        }

        mainViewModel.viewModelScope.launch {
            delay(2000)
            if (validarCamposPaciente(
                    nome,
                    cpf,
                    sobrenome,
                    email,
                    senha,
                    convenio
                ) && emailNovo && senha == confirmaSenha
            ) {
                mainViewModel.addPaciente(
                    PacienteCadastro(0, cpf, nome, sobrenome, senha, email, convenio),
                    email
                )
                findNavController().navigate(R.id.action_cadastroFragment_to_postFragment)
            } else if (!emailNovo) {
                emailNovo = true
                mainViewModel.getCadastro("")
                Toast.makeText(context, "E-mail já em uso...", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Verifique os campos!", Toast.LENGTH_SHORT).show()
            }
        }
    }


}