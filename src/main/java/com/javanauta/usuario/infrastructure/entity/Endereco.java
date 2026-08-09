package com.javanauta.usuario.infrastructure.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereco")
@Entity
@Builder
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cidade", length = 255)
    private String cidade;
    @Column(name = "rua", length = 255)
    private String rua;
    @Column(name = "numero")
    private String numero;
    @Column(name = "complemento", length = 15)
    private String complemento;
    @Column(name = "estado", length = 2)
    private String estado;
    @Column(name = "cep", length = 13)
    private String cep;
}
