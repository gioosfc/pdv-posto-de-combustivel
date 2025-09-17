package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.*;
import jakarta.websocket.OnMessage;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "pessoa")

public class Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // atributos
    @Column(length = 200, nullable = false)
    private String nomeCompleto;

    @Column(length = 14, nullable = false)
    private String cpfCnpj;

    @Column(length = 10, nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 12, nullable = false)
    private Long numeroCtps;

    // construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, Long numeroCtps) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
    }

    public Pessoa() {

    }

    // getters
    public String getNomeCompleto(){
        return nomeCompleto;
    }

    // setters
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    //getters
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    //setters

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    //getters
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    //setters
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //getters
    public Long getNumeroCtps() {
        return numeroCtps;
    }

    //setters
    public void setNumeroCtps(Long numeroCtps) {
        this.numeroCtps = numeroCtps;
    }
}
