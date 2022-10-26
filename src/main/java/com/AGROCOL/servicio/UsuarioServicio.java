package com.AGROCOL.servicio;


import com.AGROCOL.modelo.Usuario;
import com.AGROCOL.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> usuarioAll() {
        return usuarioRepositorio.findAll();
    }

    public void usuarioSave(Usuario usuario) {
        usuarioRepositorio.save(usuario);
    }

    public Usuario usuarioGet(Long id) {
        return usuarioRepositorio.findById(id).get();
    }

    public void usuarioDelete(Long id) {
        usuarioRepositorio.deleteById(id);
    }

}
