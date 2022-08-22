package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.crud.CrudController;
import br.com.hjv.eboleto.domain.Cliente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, Long> {

}
