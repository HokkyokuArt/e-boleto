package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.crud.CrudController;
import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fornecedor")
public class FornecedorController extends CrudController <Fornecedor, Long> {


}
