package com.AGROCOL.controlador;


import com.AGROCOL.modelo.Usuario;
import com.AGROCOL.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @RequestMapping("/")
    public String verPaginaDeInicio(Model modelo) {
        List<Usuario> listaUsuarios = usuarioServicio.usuarioAll();
        modelo.addAttribute("listaUsuarios", listaUsuarios);
        return "index";
    }
}
