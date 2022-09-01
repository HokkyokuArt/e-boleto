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
public class Cliente implements CrudDomain<Long> , Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="razao_social_nome")
        private String razaosocialnome;
        @Column(name="cnpj_cpf")
        private String cnpjcpf;
        @Column(name = "ie_rg")
        private String ierg;
        private String logradouro;
        private String numero;
        private String bairro;
        private String complemento;
        private String cep;
        private String cidade;
        private String estado;
        private String email;
        private String telefone;
        private String contato;
        private String senha;

}
