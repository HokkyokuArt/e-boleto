package br.com.hjv.eboleto.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoletoAlteradoDTO implements Serializable {
    private Long id;
    // private LocalDate dataemissao;
    // private LocalDate datavencimento;
    private LocalDate novovencimento;
    // private BigDecimal valor;
    // @JsonIgnore
    // private String situacao;
    // @JsonIgnore
    // private Boolean alterado;
}