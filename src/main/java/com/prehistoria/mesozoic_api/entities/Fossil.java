package com.prehistoria.mesozoic_api.entities;

import jakarta.persistence.*;

@Entity
public class Fossil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoFossil;
    private String anoDescoberta;
    private String paleontologo;

    @ManyToOne
    @JoinColumn(name = "criatura_id")
    private Criatura criatura;

    @ManyToOne
    @JoinColumn(name = "regiao_id")
    private Regiao regiao;

    public String getTipoFossil() {
        return tipoFossil;
    }

    public void setTipoFossil(String tipoFossil) {
        this.tipoFossil = tipoFossil;
    }

    public String getAnoDescoberta() {
        return anoDescoberta;
    }

    public void setAnoDescoberta(String anoDescoberta) {
        this.anoDescoberta = anoDescoberta;
    }

    public String getPaleontologo() {
        return paleontologo;
    }

    public void setPaleontologo(String paleontologo) {
        this.paleontologo = paleontologo;
    }

    public Criatura getCriatura() {
        return criatura;
    }

    public void setCriatura(Criatura criatura) {
        this.criatura = criatura;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
}
