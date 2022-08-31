package br.com.hjv.eboleto.domain;

import br.com.hjv.eboleto.core.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fornecedor implements CrudDomain<Long>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "razao_social")
    private String razaosocial;
    private String cnpj;
    private String ie;
    @Column(name = "nome_fantasia")
    private String nomefantasia;
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String email;
    private String telefone;
    @Column(name = "prazo_pagamento")
    private Long prazopagamento;
    private String senha;

}
