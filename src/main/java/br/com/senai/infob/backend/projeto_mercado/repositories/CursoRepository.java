package br.com.senai.infob.backend.projeto_mercado.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infob.backend.projeto_mercado.models.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Integer>{

}