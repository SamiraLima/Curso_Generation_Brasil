import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class Funcoes_EstoqueTest {

    val produto = Funcoes_Estoque()

    @BeforeEach
    fun lista(){
        produto.armazenarP("toddy")
        produto.armazenarP("suco")
        produto.armazenarP("chocolate")
    }

    @Test
    fun armazenarP() {
        assertEquals(3, produto.listprodutos.size)
        assertTrue(produto.listprodutos.contains("toddy"))
    }

    @Test
    fun removerP() {
        produto.removerP("toddy")
        assertEquals(3, produto.listprodutos.size)
        assertFalse(produto.listprodutos.contains("toddy"))
    }

}