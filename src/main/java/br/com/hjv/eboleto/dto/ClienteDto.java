package br.com.hjv.eboleto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO implements Serializable {

    private Long id;
    private String razaosocialnome;
    private String cnpjcpf;
    // private String ierg;
    // private String logradouro;
    // private String numero;
    // private String bairro;
    // private String complemento;
    // private String cep;
    // private String cidade;
    // private String estado;
    // private String email;
    // private String telefone;
    // private String contato;
    // private String senha;
    private List<BoletoDTO> boletos = new ArrayList<>();


}
