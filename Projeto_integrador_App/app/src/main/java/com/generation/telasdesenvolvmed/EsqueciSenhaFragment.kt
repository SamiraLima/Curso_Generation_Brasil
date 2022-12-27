package com.generation.telasdesenvolvmed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import com.generation.telasdesenvolvmed.databinding.FragmentEsqueciSenhaBinding
import com.generation.telasdesenvolvmed.databinding.FragmentLoginBinding
import com.generation.telasdesenvolvmed.model.MedicoCadastro
import com.generation.telasdesenvolvmed.model.PacienteCadastro
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

class EsqueciSenhaFragment : Fragment() {

    private lateinit var binding: FragmentEsqueciSenhaBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentEsqueciSenhaBinding.inflate(layoutInflater, container, false)

        binding.botaoVoltarLogin.setOnClickListener {
            findNavController().navigate(R.id.action_esqueciSenhaFragment_to_loginFragment)
        }

        binding.botaoVerificarEmail.setOnClickListener {
            verificaEmail()
        }

        binding.botaoAlterarSenha.setOnClickListener {
            cadastraNovaSenha()
        }

        return binding.root
    }

    private fun cadastraNovaSenha() {

        val cpf = binding.textInputSenhaCPF.text.toString()
        val senha = binding.textInputSenhaSenha.text.toString()
        val confereSenha = binding.textInputSenhaConfirmar.text.toString()

        if (mainViewModel.medicoLogado.value?.body()?.crm is String) {

            if (senha == confereSenha && cpf == mainViewModel.medicoLogado.value?.body()?.cadastro?.cpf.toString()) {
                mainViewModel.attMedico(
                    MedicoCadastro(
                        mainViewModel.medicoLogado.value?.body()?.id!!.toLong(),
                        cpf,
                        mainViewModel.medicoLogado.value?.body()?.cadastro!!.nome,
                        mainViewModel.medicoLogado.value?.body()?.cadastro!!.sobrenome,
                        senha,
                        mainViewModel.medicoLogado.value?.body()?.cadastro!!.email,
                        mainViewModel.medicoLogado.value?.body()?.crm!!
                    ), mainViewModel.medicoLogado.value?.body()?.cadastro?.email.toString()
                )

                mainViewModel.medicoLogado.value?.body()?.cadastro!!.senha = senha
                mainViewModel.cadastroVerificado.value?.body()?.senha = senha
                Toast.makeText(context, "Senha Medico alterada com sucesso", Toast.LENGTH_SHORT)
                    .show()
                findNavController().navigate(R.id.action_esqueciSenhaFragment_to_loginFragment)
            } else {
                Toast.makeText(context, "CPF ou Senha incorretos", Toast.LENGTH_SHORT).show()
            }
        } else {
            if (senha == confereSenha && cpf == mainViewModel.pacienteLogado.value?.body()?.cadastro?.cpf.toString()) {
                mainViewModel.attPaciente(
                    PacienteCadastro(
                        mainViewModel.pacienteLogado.value?.body()?.id!!.toLong(),
                        cpf,
                        mainViewModel.pacienteLogado.value?.body()?.cadastro!!.nome,
                        mainViewModel.pacienteLogado.value?.body()?.cadastro!!.sobrenome,
                        senha,
                        mainViewModel.pacienteLogado.value?.body()?.cadastro!!.email,
                        mainViewModel.pacienteLogado.value?.body()?.convenio!!
                    ), mainViewModel.pacienteLogado.value?.body()?.cadastro?.email.toString()
                )

                mainViewModel.pacienteLogado.value?.body()?.cadastro!!.senha = senha
                mainViewModel.cadastroVerificado.value?.body()?.senha = senha

                Toast.makeText(context, "Senha Paciente alterada com sucesso", Toast.LENGTH_SHORT)
                    .show()
                findNavController().navigate(R.id.action_esqueciSenhaFragment_to_loginFragment)

            } else {

                Toast.makeText(context, "CPF ou Senha incorretos", Toast.LENGTH_SHORT).show()
            }

        }

    }

    private fun validaEmail(email: String): Boolean {
        return (email.isNotBlank() && email.length in 2..255)
    }

    private fun verificaEmail() {
        val email = binding.textInputSenhaEmail.text.toString()
        mainViewModel.getCadastroByEmail(email)
        var cadastroIndentificado = false

        mainViewModel.cadastroVerificado.observe(viewLifecycleOwner) { response ->
            if (response.body() != null) {
                Toast.makeText(context, "Cadastro Encontrado", Toast.LENGTH_SHORT).show()
                cadastroIndentificado = true
            }
        }

        mainViewModel.viewModelScope.launch {
            delay(2000)
            if (validaEmail(email) && cadastroIndentificado) {

                //mainViewModel.getCadastroMedicoByEmail(email)
                //mainViewModel.getCadastroPacienteByEmail(email)
                Toast.makeText(context, "E-mail Encontrado", Toast.LENGTH_SHORT).show()
                binding.textInputRecuperarSenhaCPF.visibility = View.VISIBLE
                binding.textInputRecuperarSenha.visibility = View.VISIBLE
                binding.textInputRecuperarSenhaConfirmarSenha.visibility = View.VISIBLE
                binding.botaoAlterarSenha.visibility = View.VISIBLE
                binding.textInputEmailRecuperarSenha.visibility = View.INVISIBLE
                binding.botaoVerificarEmail.visibility = View.INVISIBLE
                binding.tituloRecuperarSenha.visibility = View.VISIBLE
            } else {
                Toast.makeText(context, "Verifique o e-mail digitado", Toast.LENGTH_SHORT).show()
            }
        }

    }

}