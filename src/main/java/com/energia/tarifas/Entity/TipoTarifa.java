package com.energia.tarifas.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoTarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String t_nome;

    @Column(nullable = false, unique = true, length = 100)
    private double valor;

    public TipoTarifa() {
    }

    public TipoTarifa(Long id, String t_nome, double valor) {
        this.id = id;
        this.t_nome = t_nome;
        this.valor = valor;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getT_nome() {
        return t_nome;
    }

    public void setT_nome(String t_nome) {
        this.t_nome = t_nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
