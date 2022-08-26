package br.com.hjv.eboleto.repository;

import br.com.hjv.eboleto.core.CrudRepository;
import br.com.hjv.eboleto.domain.Boleto;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletoRepository  extends CrudRepository<Boleto,Long> {
}
