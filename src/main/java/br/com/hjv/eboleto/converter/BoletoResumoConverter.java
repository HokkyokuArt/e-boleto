package br.com.hjv.eboleto.converter;

import br.com.hjv.eboleto.core.CrudConverter;
import br.com.hjv.eboleto.domain.Boleto;
import br.com.hjv.eboleto.dto.BoletoResumoDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BoletoResumoConverter implements CrudConverter<Boleto, BoletoResumoDTO> {

    @Override
    public BoletoResumoDTO entidadeParaDto(Boleto entidade) {
        var dto = new BoletoResumoDTO();
        dto.setId(entidade.getId());
        dto.setDataemissao(entidade.getDataemissao());
        dto.setDatavencimento(entidade.getDatavencimento());
        dto.setNovovencimento(entidade.getNovovencimento());
        // dto.setDatapagamento(entidade.getDatapagamento());
        dto.setValor(entidade.getValor());
        dto.setSituacao(entidade.getSituacao());
        dto.setAlterado(entidade.getAlterado());
        // dto.setObs(entidade.getObs());
        // dto.setCliente(clienteConverter.entidadeParaDto((entidade.getCliente())));
        // dto.setFornecedor(fornecedorConverter.entidadeParaDto(entidade.getFornecedor()));

        return dto;
    }

    @Override
    public Boleto dtoParaEntidade(BoletoResumoDTO dto) {

        var boleto = new Boleto();
        boleto.setId(dto.getId());
        boleto.setDataemissao(dto.getDataemissao());
        boleto.setDatavencimento(dto.getDatavencimento());
        boleto.setNovovencimento(dto.getNovovencimento());
        // boleto.setDatapagamento(dto.getDatapagamento());
        boleto.setValor(dto.getValor());
        boleto.setSituacao(dto.getSituacao());
        boleto.setAlterado(dto.getAlterado());
        // boleto.setObs(dto.getObs());
        // boleto.setCliente(clienteRepository.findById(dto.getClienteId()).orElse(null));
        // boleto.setFornecedor(fornecedorRepository.findById(dto.getFornecedorId()).orElse(null));

        return boleto;
    }
}
