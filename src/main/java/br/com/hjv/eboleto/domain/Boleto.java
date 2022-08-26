package br.com.hjv.eboleto.domain;

import br.com.hjv.eboleto.core.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Boleto implements CrudDomain<Long>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="data_emissao")
    private LocalDate dataemissao;
    @Column(name="data_vencimento")
    private LocalDate datavencimento;
    @Column(name="data_pagamento")
    private LocalDate datapagamento;
    @Column(name="novo_vencimento")
    private LocalDate novovencimento;
    private BigDecimal valor;
    private String situacao;
    private Boolean alterado;
    private String obs;
    @ManyToOne
    @JoinColumn(name="fornecedor_id", referencedColumnName = "id")
    private Fornecedor fornecedor;
    @JoinColumn(name="cliente_id",referencedColumnName = "id")
    @ManyToOne
    private Cliente cliente;

}
