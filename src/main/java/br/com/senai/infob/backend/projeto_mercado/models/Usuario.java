package br.com.senai.infob.backend.projeto_mercado.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="usuario")
public class Usuario {
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome", nullable=false) 
    private String nome;
    
    @Column(name="cpf", nullable=false)
    private String cpf;
    
    @Column(name="dataNascimento", nullable=false)
    private LocalDate dataNascimento;

    public Usuario() {
    }

    public Usuario(String cpf, LocalDate dataNascimento, Integer id, String nome) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
