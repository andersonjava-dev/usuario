package com.javanauta.usuario.business.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTO {

    private Long id;
    private String cidade;
    private String rua;
    private String numero;
    private String complemento;
    private String estado;
    private String cep;

}
