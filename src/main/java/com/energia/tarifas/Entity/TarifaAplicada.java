package com.energia.tarifas.Entity;



import java.sql.Timestamp;

import com.fasterxml.jackson.databind.annotation.EnumNaming;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TarifaAplicada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 8)
    private String codigoImovel;

    @Column(nullable = false, unique = true, length = 8)
    private String nomeCliente;

    @Column(nullable = false, unique = true, length = 11)
    private String cpfCliente;

    
    @Column(nullable = false, unique = true)
    @EnumNaming
    TipoUniCons tipo_contrato;

    @Column(nullable = false, unique = true)
    private double consumo;

    @Column(nullable = false, unique = true)
    private double valor;

    @Column(nullable = false, unique = true)
    private Timestamp dataMedicao;

    @Column(nullable = false, unique = true)
    private Timestamp dataVencimento;



   


}
