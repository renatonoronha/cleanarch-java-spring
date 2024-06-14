package com.example.cleanarch_java_spring.infrastructure.controllers;

import com.example.cleanarch_java_spring.domain.entity.Usuario;

public class UsuarioDTOMapper {
    CreateUserResponse toResponse(Usuario usuario){
        return new CreateUserResponse(usuario.username(), usuario.email());
    }

    public Usuario toUser(CreateUserRequest request){
        return new Usuario(request.username(), request.password(), request.email());
    }
}
