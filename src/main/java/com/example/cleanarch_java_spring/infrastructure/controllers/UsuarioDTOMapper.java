package com.example.cleanarch_java_spring.infrastructure.controllers;

import com.example.cleanarch_java_spring.domain.entity.Usuario;

/**
 * O package infrastructure é a camada de implementação
 * Converte a request em um domain object User e converte um  domain object User em response
 */
public class UsuarioDTOMapper {

    public Usuario toUser(CreateUserRequest request){
        return new Usuario(request.username(), request.password(), request.email());
    }

    CreateUserResponse toResponse(Usuario usuario){
        return new CreateUserResponse(usuario.username(), usuario.email());
    }
}
