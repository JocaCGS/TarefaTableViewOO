package com.colini.models;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Integer id;
    
    
    
    public Pessoa(String nome, Integer idade, Integer id){
        //Construtor para inicializar os nomes
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
}
