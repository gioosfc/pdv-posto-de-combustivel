package com.br.pdvpostocombustivel.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Preco {

    private BigDecimal valor;
    private Date dataAlteracao;
    private Date horaAlteracao;

    public Preco(BigDecimal valor, Date dataAlteracao, Date horaAlteracao){
        this.valor = valor;
        this.dataAlteracao = dataAlteracao;
        this.horaAlteracao = horaAlteracao;
    }

    public Preco() {
        
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Date getHoraAlteracao() {
        return horaAlteracao;
    }

    public void setHoraAlteracao(Date horaAlteracao) {
        this.horaAlteracao = horaAlteracao;
    }

    public void setHoraAlteracao(String time) {

    }
}