package br.com.senai.infoa.backend.projeto_vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_vendas.models.Usuario;

public interface UsuarioRepositoy extends JpaRepository<Usuario, Integer> {
    
}