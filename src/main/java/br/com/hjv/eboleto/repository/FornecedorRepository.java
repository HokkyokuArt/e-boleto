package br.com.hjv.eboleto.repository;

import br.com.hjv.eboleto.core.CrudRepository;
import br.com.hjv.eboleto.domain.Fornecedor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {
    @Query(value = "select prazopagamento from Fornecedor f where f.id = :id")
    Long recuperarPrazoPagamento(@Param("id") Long id);

}
