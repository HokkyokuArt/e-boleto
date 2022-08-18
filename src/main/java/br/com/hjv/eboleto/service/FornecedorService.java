package br.com.hjv.eboleto.service;

import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor>listar(){
        return fornecedorRepository.findAll();
    }

    public Fornecedor porId(Long id){
        return fornecedorRepository.findById(id).orElse(null);
    }
}
