package com.example.cleanarch_java_spring.application.usecases;

import com.example.cleanarch_java_spring.application.gateways.UsuarioGateway;
import com.example.cleanarch_java_spring.domain.entity.Usuario;

/**
 * Interactor significa Implementação de um caso de uso
 * Normalmente criaria-se uma interface pra esse use case que seria implementada por essa classe
 * Cada operação é tratada como um caso de uso
 * Interactor seria como o Service do Spring, mas sem o acoplamento com o framework pra proteger a regra de negócio
 * Utiliza o UsuarioGateway que é uma abstração no use case, não uma implementação
 * O package application só trabalhou com abstrações, nem chegou na implementação ainda
 **/
public class CreateUsuarioInteractor {
    private final UsuarioGateway usuarioGateway;

    public CreateUsuarioInteractor(UsuarioGateway usuarioGateway){
        this.usuarioGateway = usuarioGateway;
    }

    public Usuario createUser(Usuario usuario){
        return usuarioGateway.createUser(usuario);
    }
}
