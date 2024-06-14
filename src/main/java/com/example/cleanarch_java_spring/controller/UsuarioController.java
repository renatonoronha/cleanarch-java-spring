package com.example.cleanarch_java_spring.controller;

import com.example.cleanarch_java_spring.model.Usuario;
import com.example.cleanarch_java_spring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario saveUser(@RequestBody Usuario usuario){
        return usuarioService.saveUser(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUserById(@PathVariable Long id){
        return usuarioService.getUserById(id);
    }
}
