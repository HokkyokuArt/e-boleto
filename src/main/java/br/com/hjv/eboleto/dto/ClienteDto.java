package br.com.hjv.eboleto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ClienteDto implements Serializable{

        private Long id;
        private String razaoSocialNome;


}
