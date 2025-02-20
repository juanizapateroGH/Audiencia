package com.ProyectoVeranoAudiencia.ProyectoVerano.Service;

import com.ProyectoVeranoAudiencia.ProyectoVerano.Entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> listarUsuario();
    Usuario agregarUsuario(Usuario nuevoUsuario);
    Usuario modificarUsuario(Integer id, Usuario UsuarioModificado);
}