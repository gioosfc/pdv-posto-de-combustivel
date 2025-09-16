package com.br.pdvpostocombustivel;

import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdvpostocombustivelApplication.class, args);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomeCompleto("Pedro");
        pessoa1.setCpfCnpj("75210401120");
        pessoa1.setNumeroCtps(11346L);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomeCompleto("Tiago");
        pessoa2.setCpfCnpj("75210401120");
        pessoa2.setNumeroCtps(11346L);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomeCompleto("João");
        pessoa3.setCpfCnpj("75210401120");
        pessoa3.setNumeroCtps(11346L);


        System.out.println("Nome Completo: " + pessoa1.getNomeCompleto());
        System.out.println("CPF CNPJ: " + pessoa1.getCpfCnpj());
        System.out.println("Numero Ctps: " + pessoa1.getNumeroCtps());

        System.out.println("Nome Completo: " + pessoa2.getNomeCompleto());
        System.out.println("CPF CNPJ: " + pessoa2.getCpfCnpj());
        System.out.println("Numero Ctps: " + pessoa2.getNumeroCtps());

        System.out.println("Nome Completo: " + pessoa3.getNomeCompleto());
        System.out.println("CPF CNPJ: " + pessoa3.getCpfCnpj());
        System.out.println("Numero Ctps: " + pessoa3.getNumeroCtps());

	}

}
