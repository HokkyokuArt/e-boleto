package br.com.hjv.eboleto.service;

import br.com.hjv.eboleto.core.crud.CrudService;
import br.com.hjv.eboleto.domain.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends CrudService <Cliente, Long>{

    @Override
    protected Cliente editarEntidade(Cliente recuperado, Cliente entidade){
        recuperado.setRazaoSocialNome(entidade.getRazaoSocialNome());
        recuperado.setCnpjCpf(entidade.getCnpjCpf());
        recuperado.setIeRg(entidade.getIeRg());
        recuperado.setLogradouro(entidade.getLogradouro());
        recuperado.setNumero(entidade.getNumero());
        recuperado.setBairro(entidade.getBairro());
        recuperado.setComplemento(entidade.getComplemento());
        recuperado.setCep(entidade.getCep());
        recuperado.setCidade(entidade.getCidade());
        recuperado.setEstado(entidade.getEstado());
        recuperado.setEmail(entidade.getEmail());
        recuperado.setTelefone(entidade.getTelefone());
        recuperado.setContato(entidade.getContato());
        recuperado.setSenha(entidade.getSenha());

        return recuperado;
    }
}
