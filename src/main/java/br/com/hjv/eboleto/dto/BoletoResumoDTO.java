package br.com.hjv.eboleto.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoletoResumoDTO implements Serializable {
    private Long id;
    private LocalDate dataemissao;
    private LocalDate datavencimento;
    private LocalDate novovencimento;
    private BigDecimal valor;
    private String situacao;
    private Boolean alterado;
}
