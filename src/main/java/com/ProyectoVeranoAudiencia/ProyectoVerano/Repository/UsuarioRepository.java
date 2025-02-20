package com.ProyectoVeranoAudiencia.ProyectoVerano.Repository;

import com.ProyectoVeranoAudiencia.ProyectoVerano.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
