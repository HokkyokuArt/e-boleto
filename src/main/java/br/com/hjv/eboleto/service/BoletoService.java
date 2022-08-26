package br.com.hjv.eboleto.service;

import br.com.hjv.eboleto.core.CrudService;
import br.com.hjv.eboleto.domain.Boleto;
import org.springframework.stereotype.Service;

@Service
public class BoletoService extends CrudService<Boleto,Long> {

    @Override
    protected Boleto editarEntidade(Boleto recuperado, Boleto entidade) {

        recuperado.setId(entidade.getId());
        recuperado.setDataemissao(entidade.getDataemissao());
        recuperado.setDatavencimento(entidade.getDatavencimento());
        recuperado.setNovovencimento(entidade.getNovovencimento());
        recuperado.setDatapagamento(entidade.getDatapagamento());
        recuperado.setValor(entidade.getValor());
        recuperado.setSituacao(entidade.getSituacao());
        recuperado.setAlterado(entidade.getAlterado());
        recuperado.setObs(entidade.getObs());
        recuperado.setCliente(entidade.getCliente());
        recuperado.setFornecedor(entidade.getFornecedor());

        return recuperado;
    }
}
