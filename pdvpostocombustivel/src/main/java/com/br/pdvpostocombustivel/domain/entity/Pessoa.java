package com.br.pdvpostocombustivel.domain.entity;

import java.util.Date;

public class Pessoa{

    // atributos
    private String nomeCompleto;
    private String cpfCnpj;
    private Date dataNascimento;
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
    public Date getDataNascimento() {
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
