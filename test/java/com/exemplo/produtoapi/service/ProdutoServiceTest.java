package com.exemplo.produtoapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.exemplo.produtoapi.model.Produto;
import com.exemplo.produtoapi.repository.ProdutoRepository;

@ExtendWith(MockitoExtension.class)
class ProdutoServiceTest {

    @Mock
    private ProdutoRepository produtoRepository;

    @InjectMocks
    private ProdutoService produtoService;

    @Test
    void quandoSalvarProduto_deveRetornarProdutoSalvo() {
        // Cenário: Usando o construtor manual que criamos
        Produto produtoParaSalvar = new Produto(null, "Notebook Gamer", 7500.00, 10);
        Produto produtoSalvo = new Produto(1L, "Notebook Gamer", 7500.00, 10);

        when(produtoRepository.save(produtoParaSalvar)).thenReturn(produtoSalvo);

        // Ação
        Produto resultado = produtoService.salvar(produtoParaSalvar);

        // Verificação
        assertNotNull(resultado.getId());
        assertEquals("Notebook Gamer", resultado.getNome());
        verify(produtoRepository, times(1)).save(produtoParaSalvar);
    }

    @Test
    void quandoSalvarProdutoComNomeNulo_deveLancarExcecao() {
        // Cenário: Usando o construtor manual
        Produto produtoInvalido = new Produto(null, null, 100.0, 5);

        // Ação e Verificação
        assertThrows(IllegalArgumentException.class, () -> {
            produtoService.salvar(produtoInvalido);
        });
        
        verify(produtoRepository, never()).save(any());
    }
}