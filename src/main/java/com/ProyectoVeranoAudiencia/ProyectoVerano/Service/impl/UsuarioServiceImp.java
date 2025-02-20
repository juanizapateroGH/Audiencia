package com.ProyectoVeranoAudiencia.ProyectoVerano.Service.impl;

import com.ProyectoVeranoAudiencia.ProyectoVerano.Entity.Usuario;
import com.ProyectoVeranoAudiencia.ProyectoVerano.Repository.UsuarioRepository;
import com.ProyectoVeranoAudiencia.ProyectoVerano.Service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario agregarUsuario(Usuario nuevoUsuario) {
        return null;
    }

    @Override
    public Usuario modificarUsuario(Integer id, Usuario UsuarioModificado) {
        return null;
    }
}