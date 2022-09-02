package br.com.hjv.eboleto.controller;
import br.com.hjv.eboleto.converter.BoletoResumoConverter;
import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.BoletoResumoDTO;
import br.com.hjv.eboleto.dto.ClienteDTO;
import br.com.hjv.eboleto.repository.BoletoRepository;
import br.com.hjv.eboleto.service.BoletoService;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, ClienteDTO, Long> {
    @Autowired
    protected BoletoRepository boletoRepository;
    @Autowired
    protected BoletoService boletoService;
    @Autowired
    protected BoletoResumoConverter boletoResumoConverter;

    @GetMapping("/{id}/meus-boletos")
    public ResponseEntity<List<BoletoResumoDTO>> constultaBoletosPorCliente(@PathVariable("id") Cliente id) {
        var boletos = boletoRepository.constultaBoletosPorCliente(id);
        return ResponseEntity.ok(boletoService.boletoResumoDto(boletos));
    }

    @GetMapping("/{id}/meus-boletos/abertos")
    public ResponseEntity<List<BoletoResumoDTO>> constultaBoletosAbertosPorCliente(@PathVariable("id") Cliente id) {
        var boletos = boletoRepository.constultaBoletosAbertosPorCliente(id);
        return ResponseEntity.ok(boletoService.boletoResumoDto(boletos));
    }

    @PutMapping("/{id}/meus-boletos/abertos/alterar-data={idBoleto}")
    public ResponseEntity<BoletoResumoDTO> editarteste(@PathVariable("idBoleto") Long id) {
        var boletoDataAlterada = boletoService.editarDataVencimento(id);
        if (Objects.isNull(boletoDataAlterada)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(boletoResumoConverter.entidadeParaDto(boletoDataAlterada));
    }
}
