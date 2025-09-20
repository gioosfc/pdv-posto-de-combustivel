package com.br.pdvpostocombustivel.api;

import com.br.pdvpostocombustivel.api.pessoa.dto.PessoaRequest;
import com.br.pdvpostocombustivel.api.pessoa.dto.PessoaResponse;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import com.br.pdvpostocombustivel.domain.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
    


public class PessoaService {
    
    this.repositoryService = repository;
    
}

public PessoaResponse create(PessoaRequest req) {
    
    validarUnicidadeCpfCnpj(req.cpfCnpj(), null);
        Pessoa nova = toEntity(req);
        return toResponse(repository.save(nova));
        
}

private Pessoa toEntity(PessoaRequest req) {
}

private void validarUnicidadeCpfCnpj(String s, Object o) {
}

@Transactional(readOnly = true)
public PessoaResponse getById(Long id) {
    Pessoa p = repository.findById(id)
            
}