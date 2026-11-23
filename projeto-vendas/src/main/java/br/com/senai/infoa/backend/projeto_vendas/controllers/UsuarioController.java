package br.com.senai.infoa.backend.projeto_vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.infoa.backend.projeto_vendas.models.Usuario;
import br.com.senai.infoa.backend.projeto_vendas.services.UsuarioService;

public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public Usuario cadastrar(Usuario usuario) {
        return usuarioService.cadastrar(usuario);
    }

}
