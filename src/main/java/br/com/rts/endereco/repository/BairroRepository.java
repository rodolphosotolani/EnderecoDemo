package br.com.rts.endereco.repository;

import br.com.rts.endereco.domain.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<Bairro, Integer> {

}