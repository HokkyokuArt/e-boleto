package br.com.hjv.eboleto.controller;
import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.BoletoResumoDTO;
import br.com.hjv.eboleto.dto.ClienteDTO;
import br.com.hjv.eboleto.repository.BoletoRepository;
import br.com.hjv.eboleto.service.BoletoService;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, ClienteDTO, Long> {
    @Autowired
    protected BoletoRepository boletoRepository;
    public BoletoRepository getRepository() {
        return (BoletoRepository) this.boletoRepository;
    }

    @Autowired
    protected BoletoService boletoService;
    public BoletoService getService() {
        return (BoletoService) this.boletoService;
    }

    @GetMapping("/{id}/meus-boletos")
    public ResponseEntity<List<BoletoResumoDTO>> constultaBoletosPorCliente(@PathParam("id") Cliente id) {
        var boletos = this.getRepository().constultaBoletosPorCliente(id);
        return ResponseEntity.ok(this.getService().boletoResumoDto(boletos));
    }

    @GetMapping("/{id}/meus-boletos/abertos")
    public ResponseEntity<List<BoletoResumoDTO>> constultaBoletosAbertosPorCliente(@PathParam("id") Cliente id) {
        var boletos = this.getRepository().constultaBoletosAbertosPorCliente(id);
        return ResponseEntity.ok(this.getService().boletoResumoDto(boletos));
    }
}
