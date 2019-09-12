package br.com.rts.endereco.service;

import br.com.rts.endereco.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class EstadoService implements Serializable {

    @Autowired
    private EstadoRepository repository;


}
