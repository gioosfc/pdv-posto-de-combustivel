package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface PessoaRepository  extends JpaRepository<Pessoa, Integer> {
        Optional<Pessoa> findByNome(String nome);

        Optional<Pessoa> findByCpfCnpj(String cpfCnpj);

        boolean existsByCpfCnpj(String cpfCnpj);

        boolean existsByNome(String nome);


}
