package br.com.rts.endereco.service;

import br.com.rts.endereco.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class BairroService implements Serializable {

    @Autowired
    private BairroRepository repository;


}
