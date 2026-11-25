package br.com.senai.infoa.backend.projeto_vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infoa.backend.projeto_vendas.models.Usuario;
import br.com.senai.infoa.backend.projeto_vendas.repositories.UsuarioRepositoy;

@Service 
public class UsuarioService {
    
    @Autowired 
    private UsuarioRepositoy usuarioRepository;

    public Usuario cadastrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
}
