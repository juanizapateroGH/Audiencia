package com.ProyectoVeranoAudiencia.ProyectoVerano.Controller;

import com.ProyectoVeranoAudiencia.ProyectoVerano.Entity.Usuario;
import com.ProyectoVeranoAudiencia.ProyectoVerano.Service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){

        this.usuarioService = usuarioService;
    }
    public UsuarioController(UsuarioService usuarioService, UsuarioService usuarioService1) {
        this.usuarioService = usuarioService1;
    }

    @GetMapping
    public List<Usuario> listarUsuario() {
        return usuarioService.listarUsuario();
    }
}
