package br.com.hjv.eboleto.repository;

import br.com.hjv.eboleto.crud.CrudRepository;
import br.com.hjv.eboleto.domain.Fornecedor;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {
}
