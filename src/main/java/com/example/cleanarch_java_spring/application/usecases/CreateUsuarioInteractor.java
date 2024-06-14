package com.example.cleanarch_java_spring.application.usecases;

import com.example.cleanarch_java_spring.application.gateways.UsuarioGateway;
import com.example.cleanarch_java_spring.domain.entity.Usuario;

public class CreateUsuarioInteractor {
    private final UsuarioGateway usuarioGateway;

    private CreateUsuarioInteractor(UsuarioGateway usuarioGateway){
        this.usuarioGateway = usuarioGateway;
    }

    public Usuario createUser(Usuario usuario){
        return usuarioGateway.createUser(usuario);
    }
}
