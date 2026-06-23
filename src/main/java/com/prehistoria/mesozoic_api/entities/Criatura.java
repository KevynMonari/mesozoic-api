package com.prehistoria.mesozoic_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Criatura {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCientifico;
    private String nomePopular;
    private String dieta;
    private String tamanho;
    private String curiosidade;

    @ManyToOne
    @JoinColumn(name = "periodo_id")
    private Periodo periodo;
}
