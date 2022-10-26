package com.AGROCOL.repositorio;

import com.AGROCOL.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {


}
