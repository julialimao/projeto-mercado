package br.com.senai.infob.backend.projeto_mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infob.backend.projeto_mercado.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
