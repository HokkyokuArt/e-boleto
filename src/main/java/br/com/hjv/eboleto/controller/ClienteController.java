package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Boleto;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.ClienteDTO;
import br.com.hjv.eboleto.repository.BoletoRepository;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, ClienteDTO, Long> {
    
    @Autowired
    protected BoletoRepository boletoRepository;
    
    public BoletoRepository getRepository(){
        return (BoletoRepository) this.boletoRepository;
    }

    @GetMapping("/{id}/meus-boletos")
    public List<Boleto> consultarBoletosPorId(@PathParam("id") Cliente id){
        
        var boletos = this.getRepository().constultaBoletosPorCliente(id);

        return boletos;

    }
}
