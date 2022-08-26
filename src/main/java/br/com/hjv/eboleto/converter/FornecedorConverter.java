package br.com.hjv.eboleto.converter;

import br.com.hjv.eboleto.core.CrudConverter;
import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.dto.FornecedorDTO;
import org.springframework.stereotype.Component;

@Component
public class FornecedorConverter implements CrudConverter<Fornecedor, FornecedorDTO> {

    @Override
    public FornecedorDTO entidadeParaDto( Fornecedor entidade){
        var dto = new FornecedorDTO();

        dto.setId(entidade.getId());
        dto.setRazaosocial(entidade.getRazaosocial());
        dto.setCnpj(entidade.getCnpj());
        dto.setIe(entidade.getIe());
        dto.setNomefantasia(entidade.getNomefantasia());
        dto.setLogradouro(entidade.getLogradouro());
        dto.setNumero(entidade.getNumero());
        dto.setBairro(entidade.getBairro());
        dto.setComplemento(entidade.getComplemento());
        dto.setCep(entidade.getCep());
        dto.setCidade(entidade.getCidade());
        dto.setEstado(entidade.getEstado());
        dto.setEmail(entidade.getEmail());
        dto.setTelefone(entidade.getTelefone());
        dto.setPrazopagamento(entidade.getPrazopagamento());
        dto.setEmail(entidade.getSenha());

        return  dto;
    }

    @Override
    public Fornecedor dtoParaEntidade(FornecedorDTO dto){

        var fornecedor = new Fornecedor();
        fornecedor.setId(dto.getId());
        fornecedor.setRazaosocial(dto.getRazaosocial());
        fornecedor.setCnpj(dto.getCnpj());
        fornecedor.setIe(dto.getIe());
        fornecedor.setNomefantasia(dto.getNomefantasia());
        fornecedor.setLogradouro(dto.getLogradouro());
        fornecedor.setNumero(dto.getNumero());
        fornecedor.setBairro(dto.getBairro());
        fornecedor.setComplemento(dto.getComplemento());
        fornecedor.setCep(dto.getCep());
        fornecedor.setCidade(dto.getCidade());
        fornecedor.setEstado(dto.getEstado());
        fornecedor.setEmail(dto.getEmail());
        fornecedor.setTelefone(dto.getTelefone());
        fornecedor.setPrazopagamento(dto.getPrazopagamento());
        fornecedor.setSenha(dto.getSenha());

        return fornecedor;
    }
}
