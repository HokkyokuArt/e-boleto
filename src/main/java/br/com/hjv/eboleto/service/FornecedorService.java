package br.com.hjv.eboleto.service;

import br.com.hjv.eboleto.core.CrudService;
import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.repository.FornecedorRepository;

import org.springframework.stereotype.Service;

@Service
public class FornecedorService extends CrudService<Fornecedor,Long> {
    public FornecedorRepository getRepository(){
        return (FornecedorRepository) repository;
    }

    @Override
    protected Fornecedor editarEntidade(Fornecedor recuperado, Fornecedor entidade) {
        recuperado.setRazaosocial(entidade.getRazaosocial());
        recuperado.setCnpj(entidade.getCnpj());
        recuperado.setIe(entidade.getIe());
        recuperado.setNomefantasia(entidade.getNomefantasia());
        recuperado.setLogradouro(entidade.getLogradouro());
        recuperado.setNumero(entidade.getNumero());
        recuperado.setBairro(entidade.getBairro());
        recuperado.setComplemento(entidade.getComplemento());
        recuperado.setCep(entidade.getCep());
        recuperado.setCidade(entidade.getCidade());
        recuperado.setEstado(entidade.getEstado());
        recuperado.setEmail(entidade.getEmail());
        recuperado.setTelefone(entidade.getTelefone());
        recuperado.setPrazopagamento(entidade.getPrazopagamento());
        // recuperado.setSenha(entidade.getSenha());

        return recuperado;
    }

    public Long recuperarPrazoPagamento(Long id){
        return getRepository().recuperarPrazoPagamento(id);
        
    }
}
