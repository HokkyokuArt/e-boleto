package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public ResponseEntity<List<Fornecedor>>listar(){

        var fornecedores= fornecedorService.listar();
        return ResponseEntity.ok(fornecedores);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor>especifico(@PathVariable("id") Long id){

       var resultado= fornecedorService.porId(id);

        if (Objects.isNull(resultado)){
                return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(resultado);

    }

}
