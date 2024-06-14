package com.example.cleanarch_java_spring.application.gateways;

import com.example.cleanarch_java_spring.domain.entity.Usuario;

public interface UsuarioGateway {
    Usuario createUser(Usuario usuario);
}
