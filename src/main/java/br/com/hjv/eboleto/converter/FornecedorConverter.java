package br.com.hjv.eboleto.converter;

import br.com.hjv.eboleto.core.crud.CrudConverter;
import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.dto.FornecedorDTO;
import org.springframework.stereotype.Component;

@Component
public class FornecedorConverter implements CrudConverter<Fornecedor, FornecedorDTO> {

    @Override
    public FornecedorDTO entidadeParaDto( Fornecedor entidade){
        var dto = new FornecedorDTO();

        dto.setId(entidade.getId());
        dto.setRazaoSocial(entidade.getRazaoSocial());

        return  dto;
    }

    @Override
    public Fornecedor dtoParaEntidade(FornecedorDTO dto){

        var fornecedor = new Fornecedor();
        fornecedor.setId(dto.getId());
        fornecedor.setRazaoSocial(dto.getRazaoSocial());

        return fornecedor;
    }
}
