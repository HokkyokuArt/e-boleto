package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Boleto;
import br.com.hjv.eboleto.dto.BoletoDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boleto")
public class BoletoController extends CrudController<Boleto, BoletoDTO, Long> {

    
}
