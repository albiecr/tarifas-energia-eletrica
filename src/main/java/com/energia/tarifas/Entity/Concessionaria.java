package com.energia.tarifas.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Concessionaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 50)
    private String c_nome;
    @Column(nullable = false, unique = true, length = 100)
    private String estado;
    
    public Concessionaria() {
    }

    public Concessionaria(Long id, String c_nome, String estado) {
        this.id = id;
        this.c_nome = c_nome;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getC_nome() {
        return c_nome;
    }

    public void setC_nome(String c_nome) {
        this.c_nome = c_nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    


}
