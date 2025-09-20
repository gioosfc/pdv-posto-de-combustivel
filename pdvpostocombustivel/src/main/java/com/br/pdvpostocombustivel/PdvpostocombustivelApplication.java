package com.br.pdvpostocombustivel;

import com.br.pdvpostocombustivel.domain.entity.*;
import com.br.pdvpostocombustivel.domain.entity.Contato;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import com.br.pdvpostocombustivel.domain.entity.Acesso;
import com.br.pdvpostocombustivel.domain.entity.Custo;
import com.br.pdvpostocombustivel.domain.entity.Estoque;
import com.br.pdvpostocombustivel.domain.entity.Preco;
import com.br.pdvpostocombustivel.domain.entity.Produto;
import java.util.Date;
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


        Contato contato1= new Contato();
        contato1.setEmail("giovannaalice2002@gmail.com");
        contato1.setEndereco("Rua rua quadra quadra lote lote");
        contato1.setTelefone("11-11-11-11");

        Contato contato2 = new Contato();
        contato2.setEmail("gioferrcosta@outlook.com");
        contato2.setEndereco("Rua rua quadra quadra lote lote");
        contato2.setTelefone("11-11-11-11");

        Contato contato3 = new Contato();
        contato3.setEmail("giovanna@email.com");
        contato3.setEndereco("Rua rua quadra quadra lote lote");
        contato3.setTelefone("11-11-11-11");

        System.out.println("Telefone " + contato1.getTelefone());
        System.out.println("Email: " + contato1.getEmail());
        System.out.println("Endereço: " + contato1.getEndereco());

        System.out.println("Telefone " + contato2.getTelefone());
        System.out.println("Email: " + contato2.getEmail());
        System.out.println("Endereço: " + contato2.getEndereco());

        System.out.println("Telefone " + contato3.getTelefone());
        System.out.println("Email: " + contato3.getEmail());
        System.out.println("Endereço: " + contato3.getEndereco());

        Acesso acesso1 = new Acesso();
        acesso1.setSenha("123456");
        acesso1.setUsuario("Joao");

        Acesso acesso2 = new Acesso();
        acesso2.setSenha("654321");
        acesso2.setUsuario("Pedro");

        Acesso acesso3 = new Acesso();
        acesso3.setSenha("235732");
        acesso3.setUsuario("Tiago");

        System.out.println("Usuario: " + acesso1.getUsuario());
        System.out.println("Senha: " + acesso1.getSenha());

        System.out.println("Usuario: " + acesso2.getUsuario());
        System.out.println("Senha: " + acesso2.getSenha());

        System.out.println("Usuario: " + acesso3.getUsuario());
        System.out.println("Senha: " + acesso3.getSenha());

        Custo custo1 = new Custo();
        custo1.setCustoFixo(Double.parseDouble("3.45"));
        custo1.setCustoVariavel("2,67");
        custo1.setImposto(Double.parseDouble("13.00"));
        custo1.setDataProcessamento("19/09/2025");
        custo1.setMargemLucro(Double.parseDouble("3.45"));

        Custo custo2 = new Custo();
        custo2.setCustoFixo(Double.parseDouble("3.45"));
        custo2.setCustoVariavel("2,67");
        custo2.setImposto(Double.parseDouble("13.00"));
        custo2.setDataProcessamento("19/09/2025");
        custo2.setMargemLucro(Double.parseDouble("3.45"));

        Custo custo3 = new Custo();
        custo3.setCustoFixo(Double.parseDouble("3.45"));
        custo3.setCustoVariavel("2,67");
        custo3.setImposto(Double.parseDouble("13.00"));
        custo3.setDataProcessamento("19/09/2025");
        custo3.setMargemLucro(Double.parseDouble("3.45"));

        System.out.println("Custo Fixo: " + custo1.getCustoFixo());
        System.out.println("Custo Variavel: " + custo1.getCustoVariavel());
        System.out.println("Imposto: " + custo1.getImposto());
        System.out.println("Data de Processamento: " + custo1.getDataProcessamento());
        System.out.println("Marge Lucro: " + custo1.getMargemLucro());

        System.out.println("Custo Fixo: " + custo2.getCustoFixo());
        System.out.println("Custo Variavel: " + custo2.getCustoVariavel());
        System.out.println("Imposto: " + custo2.getImposto());
        System.out.println("Data de Processamento: " + custo2.getDataProcessamento());
        System.out.println("Marge Lucro: " + custo2.getMargemLucro());

        System.out.println("Custo Fixo: " + custo3.getCustoFixo());
        System.out.println("Custo Variavel: " + custo3.getCustoVariavel());
        System.out.println("Imposto: " + custo3.getImposto());
        System.out.println("Data de Processamento: " + custo3.getDataProcessamento());
        System.out.println("Marge Lucro: " + custo3.getMargemLucro());


        Estoque estoque1 = new Estoque();
        estoque1.setDataValidade("01/01/2002");
        estoque1.setLocalEndereco("Rua quadra lote");
        estoque1.setQuantidade("1");
        estoque1.setLocalTanque("Rua quadra lote");
        estoque1.setLoteFabricacao("3244");

        Estoque estoque2 = new Estoque();
        estoque2.setDataValidade("01/01/2002");
        estoque2.setLocalEndereco("Rua quadra lote");
        estoque2.setQuantidade("1");
        estoque2.setLocalTanque("Rua quadra lote");
        estoque2.setLoteFabricacao("3244");

        Estoque estoque3 = new Estoque();
        estoque3.setDataValidade("01/01/2002");
        estoque3.setLocalEndereco("Rua quadra lote");
        estoque3.setQuantidade("1");
        estoque3.setLocalTanque("Rua quadra lote");
        estoque3.setLoteFabricacao("3244");

        System.out.println("Data de Validade: " + estoque1.getDataValidade());
        System.out.println("Local do Endereço: " + estoque1.getLocalEndereco());
        System.out.println("Local do Tanque: " + estoque1.getLocalTanque());
        System.out.println("Local do Lote: " + estoque1.getLoteFabricacao());
        System.out.println("Lote de Fabricação: " + estoque1.getLoteFabricacao());

        System.out.println("Data de Validade: " + estoque2.getDataValidade());
        System.out.println("Local do Endereço: " + estoque2.getLocalEndereco());
        System.out.println("Local do Tanque: " + estoque2.getLocalTanque());
        System.out.println("Local do Lote: " + estoque2.getLoteFabricacao());
        System.out.println("Lote de Fabricação: " + estoque2.getLoteFabricacao());

        System.out.println("Data de Validade: " + estoque3.getDataValidade());
        System.out.println("Local do Endereço: " + estoque3.getLocalEndereco());
        System.out.println("Local do Tanque: " + estoque3.getLocalTanque());
        System.out.println("Local do Lote: " + estoque3.getLoteFabricacao());
        System.out.println("Lote de Fabricação: " + estoque3.getLoteFabricacao());

        Preco preco1 = new Preco();
        preco1.setValor("1.50");
        preco1.setDataAlteracao("25/05/2002");
        preco1.setHoraAlteracao("22:00");

        Preco preco2 = new Preco();
        preco2.setValor("1.50");
        preco2.setDataAlteracao("25/05/2002");
        preco2.setHoraAlteracao("22:00");

        Preco preco3 = new Preco();
        preco3.setValor("1.50");
        preco3.setDataAlteracao("25/05/2002");
        preco3.setHoraAlteracao("22:00");

        System.out.println("Valor: " + preco1.getValor());
        System.out.println("Data de Alteracao: " + preco1.getDataAlteracao());
        System.out.println("Hora da Alteração: " + preco1.getHoraAlteracao());

        System.out.println("Valor: " + preco2.getValor());
        System.out.println("Data de Alteracao: " + preco2.getDataAlteracao());
        System.out.println("Hora da Alteração: " + preco2.getHoraAlteracao());

        System.out.println("Valor: " + preco3.getValor());
        System.out.println("Data de Alteracao: " + preco3.getDataAlteracao());
        System.out.println("Hora da Alteração: " + preco3.getHoraAlteracao());


        Produto produto1 = new Produto();
        produto1.setNome("Gasolina");
        produto1.setCategoria("A");
        produto1.setFornecedor("João do gás");
        produto1.setMarca("Petrobras");
        produto1.setReferencia("AAAAA");

        Produto produto2 = new Produto();
        produto2.setNome("Gasolina");
        produto2.setCategoria("A");
        produto2.setFornecedor("João do gás");
        produto2.setMarca("Petrobras");
        produto2.setReferencia("AAAAA");

        Produto produto3 = new Produto();
        produto3.setNome("Gasolina");
        produto3.setCategoria("A");
        produto3.setFornecedor("João do gás");
        produto3.setMarca("Petrobras");
        produto3.setReferencia("AAAAA");

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Categoria: " + produto1.getCategoria());
        System.out.println("Fornecedor: " + produto1.getFornecedor());
        System.out.println("Marca: " + produto1.getMarca());
        System.out.println("Referencia: " + produto1.getReferencia());

        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Categoria: " + produto2.getCategoria());
        System.out.println("Fornecedor: " + produto2.getFornecedor());
        System.out.println("Marca: " + produto2.getMarca());
        System.out.println("Referencia: " + produto2.getReferencia());

        System.out.println("Nome: " + produto3.getNome());
        System.out.println("Categoria: " + produto3.getCategoria());
        System.out.println("Fornecedor: " + produto3.getFornecedor());
        System.out.println("Marca: " + produto3.getMarca());
        System.out.println("Referencia: " + produto3.getReferencia());




    }

}
