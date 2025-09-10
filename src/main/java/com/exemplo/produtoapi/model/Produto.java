package com.exemplo.produtoapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 3, max = 100)
    private String nome;

    @NotNull(message = "O preço não pode ser nulo")
    @Positive(message = "O preço deve ser um valor positivo")
    private Double preco;

    @NotNull(message = "A quantidade não pode ser nula")
    @Min(value = 0, message = "A quantidade não pode ser negativa")
    private Integer quantidade;

    // Construtor padrão (sem argumentos) - essencial para o JPA e Spring
    public Produto() {
    }

    // Construtor com todos os argumentos - essencial para os testes
    public Produto(Long id, String nome, Double preco, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // --- GETTERS E SETTERS ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}