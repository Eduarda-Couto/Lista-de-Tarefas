package com.eduarda.desafiotodolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*Esse foi o meu primeiro projeto, não tinha nenhuma base de backend ao começar,
 na faculdade ainda não foi passado. Pelo tempo infelizmente não pude terminar, 
 foram muitos erros, instalações que eu tive que pesquisar aprender e que me consumiram
 * tempo resolvendo. E como fiquei dedicada em aprender do 0 backend não consegui estatar com a 
 * parte do frontend que é uma aréa que já tenho mais acesso.
 * Não consegui terminar o backend, pois agarrei no erro de URL, mas foi uma experiência muito boa,
 * e continuarei estudando e dedicando para conseguir um estagio na Stefanini.
  */
@Entity
@Table(name = "task2")
public class todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String status;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}