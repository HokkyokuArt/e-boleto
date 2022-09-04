package br.com.hjv.eboleto.repository;

import br.com.hjv.eboleto.core.CrudRepository;
import br.com.hjv.eboleto.domain.Cliente;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    @Query(value = "select c from Cliente c where c.email = :email and c.senha = :senha")
    Cliente autenticacaoUser(@Param("email") String email, @Param("senha") String senha);

}
