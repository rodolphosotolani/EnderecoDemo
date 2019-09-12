package br.com.rts.endereco.service;

import br.com.rts.endereco.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class CidadeService implements Serializable {

    @Autowired
    private CidadeRepository repository;
}
