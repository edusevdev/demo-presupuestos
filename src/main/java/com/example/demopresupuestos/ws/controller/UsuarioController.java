package com.example.demopresupuestos.ws.controller;

import com.example.demopresupuestos.model.entity.Usuario;
import com.example.demopresupuestos.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/users")
    public List<Usuario> obtenerUsuarios() {
        return this.usuarioRepository.findAll();
    }
}
