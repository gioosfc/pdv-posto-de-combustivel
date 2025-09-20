package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.*;

@Entity
@Table( name = "acesso")

public class Acesso{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //atributos

    @Column(length = 200, nullable = false)
    private String usuario;

    @Column(length = 6, nullable = false)
    private String senha;

    //construtor
    public Acesso(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public Acesso() {

    }

    //getters
    public String getUsuario() {
        return usuario;
    }

    //setters
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //getters
    public String getSenha() {
        return senha;
    }

    //setters
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
