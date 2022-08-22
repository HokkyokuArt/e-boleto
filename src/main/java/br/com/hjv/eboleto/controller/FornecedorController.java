package br.com.hjv.eboleto.controller;

import br.com.hjv.eboleto.core.crud.CrudController;
import br.com.hjv.eboleto.domain.Fornecedor;
import br.com.hjv.eboleto.dto.FornecedorDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fornecedor")
public class FornecedorController extends CrudController <Fornecedor, FornecedorDTO, Long> {


}
