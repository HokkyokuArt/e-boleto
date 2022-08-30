package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Boleto;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.BoletoDTO;
import br.com.hjv.eboleto.repository.BoletoRepository;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boleto")
public class BoletoController extends CrudController<Boleto, BoletoDTO, Long> {

    public BoletoRepository getRepository(){
        return (BoletoRepository) this.repository;
    }

    @GetMapping("/cliente={id}")
    public List<Boleto> consultarBoletosPorId(@PathParam("id") Cliente id){
        
        var boletos = this.getRepository().constultaBoletosPorCliente(id);

        return boletos;

    }
}
