package br.com.hjv.eboleto.service;

import br.com.hjv.eboleto.core.CrudService;
import br.com.hjv.eboleto.domain.Boleto;
import br.com.hjv.eboleto.dto.BoletoResumoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletoService extends CrudService<Boleto, Long> {
    @Autowired
    protected FornecedorService fornecedorService;
    // protected Fornecedor fornecedor;
    
    // public Fornecedor getFornecedor() {
    //     return (Fornecedor) this.fornecedor;
    // }

    @Override
    protected Boleto editarEntidade(Boleto recuperado, Boleto entidade) {

        recuperado.getDatavencimento();
        // recuperado.setId(entidade.getId());
        // recuperado.setDataemissao(entidade.getDataemissao());
        // recuperado.setDatavencimento(entidade.getDatavencimento());
            //  recuperado.setNovovencimento(entidade.getNovovencimento());
            //  recuperado.setNovovencimento(LocalDate.now().plusDays(fornecedorService.recuperarPrazoPagamento(recuperado.getFornecedor().getId())));
             recuperado.setNovovencimento(recuperado.getDatavencimento().plusDays(fornecedorService.recuperarPrazoPagamento(recuperado.getFornecedor().getId())));
        // recuperado.setDatapagamento(entidade.getDatapagamento());
        // recuperado.setValor(entidade.getValor());
        // recuperado.setSituacao(entidade.getSituacao());
        recuperado.setAlterado(true);
        // recuperado.setObs(entidade.getObs());
        // recuperado.setCliente(entidade.getCliente());
        // recuperado.setFornecedor(entidade.getFornecedor());

        return recuperado;
    }

    public List<BoletoResumoDTO> boletoResumoDto(List<Boleto> boletos) {
        var boletoDto = boletos.stream().map(boleto -> new BoletoResumoDTO(
                boleto.getId(),
                boleto.getDataemissao(),
                boleto.getDatavencimento(),
                boleto.getNovovencimento(),
                boleto.getValor(),
                boleto.getSituacao(),
                boleto.getAlterado()
                )).collect(Collectors.toList());
        return boletoDto;
    }   
    
    public Boleto editarDataVencimento(Long id){
        var recuperado = porId(id);
        if(Objects.isNull(recuperado)){
            throw new RuntimeException("Não encontrado");
        } else if(!recuperado.getAlterado()){
            Boleto novaEntidade = editarEntidade(recuperado, recuperado);
            return repository.save(novaEntidade);
        }
        return null;
    }
}
