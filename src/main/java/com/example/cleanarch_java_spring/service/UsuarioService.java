package com.example.cleanarch_java_spring.service;

import com.example.cleanarch_java_spring.model.Usuario;
import com.example.cleanarch_java_spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario saveUser(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario getUserById(Long id){
        return usuarioRepository.findById(id).get();
    }
}
