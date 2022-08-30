package br.com.hjv.eboleto.controller;
import br.com.hjv.eboleto.core.CrudController;
import br.com.hjv.eboleto.domain.Cliente;
import br.com.hjv.eboleto.dto.BoletoResumoDTO;
import br.com.hjv.eboleto.dto.ClienteDTO;
import br.com.hjv.eboleto.repository.BoletoRepository;
import java.util.List;
import java.util.stream.Collectors;
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

    @GetMapping("/{id}/meus-boletos")
    public ResponseEntity<List<BoletoResumoDTO>> consultarBoletosPorId(@PathParam("id") Cliente id) {
        var boletos = this.getRepository().constultaBoletosPorCliente(id);
        var boletoDto = boletos.stream().map(boleto -> new BoletoResumoDTO(
                boleto.getDataemissao(),
                boleto.getDatavencimento(),
                boleto.getNovovencimento(),
                boleto.getValor(),
                boleto.getSituacao(),
                boleto.getAlterado())).collect(Collectors.toList());

        return ResponseEntity.ok(boletoDto);
    }
}
