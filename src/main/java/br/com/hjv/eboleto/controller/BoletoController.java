package br.com.hjv.eboleto.controller;
import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Boleto;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.BoletoDTO;
import br.com.hjv.eboleto.repository.BoletoRepository;
import br.com.hjv.eboleto.service.BoletoService;
import br.com.hjv.eboleto.service.FornecedorService;
import lombok.var;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boleto")
public class BoletoController extends CrudController<Boleto, BoletoDTO, Long> {
    @Autowired
    protected BoletoRepository boletoRepository;

    public BoletoRepository getRepository() {
        return (BoletoRepository) this.boletoRepository;
    }
    @Autowired
    protected BoletoService boletoService;

    @Autowired
    protected FornecedorService fornecedorService;


    @GetMapping("/cliente={id}/boletos-abertos")
    public ResponseEntity<List<Boleto>> constultaBoletosAbertosPorCliente(@PathVariable("id") Cliente id) {
        var boletos = this.getRepository().constultaBoletosAbertosPorCliente(id);
        return ResponseEntity.ok(boletos);
    }

    @GetMapping("/cliente={id}/todos-boletos")
    public ResponseEntity<List<Boleto>>constultaBoletosPorCliente(@PathVariable("id") Cliente id) {
        var boletos = this.getRepository().constultaBoletosPorCliente(id);
        return ResponseEntity.ok(boletos);
    }   

}
