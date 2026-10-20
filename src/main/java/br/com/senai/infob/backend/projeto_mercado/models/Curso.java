package br.com.senai.infob.backend.projeto_mercado.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="curso") 
public class Curso { 
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome", nullable=false) 
    private String nome;
    
    @Column(name="descrição", nullable=false)
    private String descrição;
    
    @Column(name="dataInicio", nullable=false)
    private LocalDate dataInicio;

    @Column(name="dataFinalização", nullable=false)
    private LocalDate dataFinalização;

    public Curso() {
    }

    public Curso(Integer id, String nome, String descrição, LocalDate dataInicio, LocalDate dataFinalização) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.dataInicio = dataInicio;
        this.dataFinalização = dataFinalização;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinalização() {
        return dataFinalização;
    }

    public void setDataFinalização(LocalDate dataFinalização) {
        this.dataFinalização = dataFinalização;
    }
}

    