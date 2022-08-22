package br.com.hjv.eboleto.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

public abstract class CrudController <T,ID>{
    @Autowired
    protected CrudService<T,ID> service;

    public ResponseEntity<List<T>>listar(){

        var listaEntidade= service.listar();
        return ResponseEntity.ok(listaEntidade);

    }
    @GetMapping("/{id}")
    public ResponseEntity<T>especifico(@PathVariable("id") ID id){

        var especifico= service.porId(id);

        if (Objects.isNull(especifico)){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(especifico);

    }

    @PostMapping
    public ResponseEntity<T>criar (@RequestBody T entidade){
        var salvo = service.criar(entidade);
        return ResponseEntity.ok(salvo);
    }

    @PutMapping
    public ResponseEntity<T> editar(@PathVariable("id")ID id, @RequestBody T entidade){
        return ResponseEntity.ok(service.editar(id,entidade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id")ID id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }


}
