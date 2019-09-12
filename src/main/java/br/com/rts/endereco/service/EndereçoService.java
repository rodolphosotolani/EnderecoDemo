package br.com.rts.endereco.service;

import br.com.rts.endereco.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class EndereçoService implements Serializable {

    @Autowired
    private EnderecoRepository repository;

}
