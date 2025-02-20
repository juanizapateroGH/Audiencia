package com.ProyectoVeranoAudiencia.ProyectoVerano.Repository;

import com.ProyectoVeranoAudiencia.ProyectoVerano.Entity.Distrito;
import com.ProyectoVeranoAudiencia.ProyectoVerano.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistritoRepository extends JpaRepository<Distrito, Long> {
}
