package br.com.hjv.eboleto.converter;

import br.com.hjv.eboleto.core.CrudConverter;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.ClienteDTO;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter implements CrudConverter<Cliente, ClienteDTO> {
    @Override
    public ClienteDTO entidadeParaDto(Cliente entidade) {

        //return new ClienteDto(entidade.getId(), entidade.getRazaoSocialNome());
        var dto = new ClienteDTO();

        dto.setId(entidade.getId());
        dto.setRazaosocialnome(entidade.getRazaosocialnome());
        dto.setCnpjcpf(entidade.getCnpjcpf());
        // dto.setIerg(entidade.getIerg());
        // dto.setLogradouro(entidade.getLogradouro());
        // dto.setNumero(entidade.getNumero());
        // dto.setBairro(entidade.getBairro());
        // dto.setComplemento(entidade.getComplemento());
        // dto.setCep(entidade.getCep());
        // dto.setCidade(entidade.getCidade());
        // dto.setEstado(entidade.getEstado());
        // dto.setEmail(entidade.getEmail());
        // dto.setTelefone(entidade.getTelefone());
        // dto.setContato(entidade.getContato());
        // dto.setSenha(entidade.getSenha());

        return  dto;
    }

    @Override
    public Cliente dtoParaEntidade(ClienteDTO dto) {
        //return new Cliente(dto.getId(), dto.getRazaoSocialNome());

        var cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setRazaosocialnome(dto.getRazaosocialnome());
        cliente.setCnpjcpf(dto.getCnpjcpf());
        // cliente.setIerg(dto.getIerg());
        // cliente.setLogradouro(dto.getLogradouro());
        // cliente.setNumero(dto.getNumero());
        // cliente.setBairro(dto.getBairro());
        // cliente.setComplemento(dto.getComplemento());
        // cliente.setCep(dto.getCep());
        // cliente.setCidade(dto.getCidade());
        // cliente.setEstado(dto.getEstado());
        // cliente.setEmail(dto.getEmail());
        // cliente.setTelefone(dto.getTelefone());
        // cliente.setContato(dto.getContato());
        // cliente.setSenha(dto.getSenha());

        return cliente;

    }
}
