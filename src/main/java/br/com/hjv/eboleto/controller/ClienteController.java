package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.ClienteDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, ClienteDTO, Long> {

}
