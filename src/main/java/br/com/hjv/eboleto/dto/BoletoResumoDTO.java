package br.com.hjv.eboleto.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoletoResumoDTO implements Serializable {
    private LocalDate dataemissao;
    private LocalDate datavencimento;
    private LocalDate novovencimento;
    private BigDecimal valor;
    @JsonIgnore
    private String situacao;
    @JsonIgnore
    private Boolean alterado;
}
