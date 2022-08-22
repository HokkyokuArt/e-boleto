package br.com.hjv.eboleto.repository;

import br.com.hjv.eboleto.core.crud.CrudRepository;
import br.com.hjv.eboleto.domain.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
