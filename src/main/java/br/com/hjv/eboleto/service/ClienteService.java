package br.com.hjv.eboleto.service;

import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente>listar(){
        return clienteRepository.findAll();
    }

    public Cliente porId(Long id){
        return clienteRepository.findById(id).orElse(null);
    }
}
