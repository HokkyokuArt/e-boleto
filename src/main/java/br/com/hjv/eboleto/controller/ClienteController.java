package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.core.crud.CrudController;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.ClienteDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")

public class ClienteController extends CrudController<Cliente, ClienteDto, Long> {

}
