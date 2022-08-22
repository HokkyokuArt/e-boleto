package br.com.hjv.eboleto.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
