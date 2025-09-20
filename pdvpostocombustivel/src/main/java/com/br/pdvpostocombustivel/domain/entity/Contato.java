package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "contato")

public class Contato{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //atributos

    @Column(length = 13, nullable = false)
    private String telefone;

    @Column(length = 45, nullable = false)
    private String email;

    @Column(length = 200, nullable = false)
    private String endereco;

    //construtor
    public Contato(String telefone, String email, String endereco){
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Contato() {

    }

    //getters
    public String getTelefone() {
        return telefone;
    }

    //setters
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //getters
    public String getEmail() {
        return email;
    }

    //setters
    public void setEmail(String email) {
        this.email = email;
    }

    //getters
    public String getEndereco() {
        return endereco;
    }

    //setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}