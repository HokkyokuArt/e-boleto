package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>>listar(){

        var clientes=clienteService.listar();

        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente>especifico(@PathVariable("id") Long id){
            //var resultado =  clientes().stream()
           // .filter(cliente -> cliente.getId().equals(id))
           // .findFirst()
           // .orElse(null);

            var resultado=clienteService.porId(id);

            return ResponseEntity.ok(resultado);
    }

}
