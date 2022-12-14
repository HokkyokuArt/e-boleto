package br.com.hjv.eboleto.repository;
import br.com.hjv.eboleto.core.CrudRepository;
import br.com.hjv.eboleto.domain.Boleto;
import br.com.hjv.eboleto.domain.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletoRepository  extends CrudRepository<Boleto,Long> {
    String select = "select b from Boleto b where b.cliente = :cliente_id ";

    @Query(value = select + "and b.situacao = 'aberto'")
    List<Boleto> constultaBoletosAbertosPorCliente(@Param("cliente_id") Cliente id);

    @Query(value = select)
    List<Boleto> constultaBoletosPorCliente(@Param("cliente_id") Cliente id);
}
