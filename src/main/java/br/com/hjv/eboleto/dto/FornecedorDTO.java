package br.com.hjv.eboleto.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FornecedorDTO  implements Serializable {

    private Long id;
    private String razaoSocial;
    private String cnpj;
    private String ie;
    private String nomeFantasia;
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String email;
    private String telefone;
    private String prazoPagamento;
    private String senha;

}
