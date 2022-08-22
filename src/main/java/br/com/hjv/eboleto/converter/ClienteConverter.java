package br.com.hjv.eboleto.converter;

import br.com.hjv.eboleto.core.crud.CrudConverter;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.dto.ClienteDto;
import br.com.hjv.eboleto.dto.FornecedorDTO;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter implements CrudConverter<Cliente, ClienteDto> {


    @Override
    public ClienteDto entidadeParaDto(Cliente entidade) {

        return new ClienteDto(entidade.getId(), entidade.getRazaoSocialNome());
    }

    @Override
    public Cliente dtoParaEntidade(ClienteDto dto) {
        //return new Cliente(dto.getId(), dto.getRazaoSocialNome());

        var cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setRazaoSocialNome(dto.getRazaoSocialNome());

        return cliente;

    }
}
