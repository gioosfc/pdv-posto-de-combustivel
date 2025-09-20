package com.br.pdvpostocombustivel.domain.entity;

import com.br.pdvpostocombustivel.domain.enums.TipoPessoa;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pessoa")

public class Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // atributos
    @Column(name = "nome_completo", length = 200, nullable = false)
    private String nomeCompleto;

    @Column(name = "cpf_cnpj", length = 14, nullable = false)
    private String cpfCnpj;

    @Column(name = "data_nascimento", length = 10, nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "numero_ctps", length = 12, nullable = false)
    private Long numeroCtps;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", length = 15, nullable = false)
    private TipoPessoa tipoPessoa;

    // construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, LocalDate dataNascimento, Long numeroCtps) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
        this.tipoPessoa = tipoPessoa;
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
    public void setDataNascimento(LocalDate dataNascimento) {
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
