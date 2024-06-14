package com.example.cleanarch_java_spring.main;

import com.example.cleanarch_java_spring.application.gateways.UsuarioGateway;
import com.example.cleanarch_java_spring.application.usecases.CreateUsuarioInteractor;
import com.example.cleanarch_java_spring.infrastructure.controllers.UsuarioDTOMapper;
import com.example.cleanarch_java_spring.infrastructure.gateways.UsuarioEntityMapper;
import com.example.cleanarch_java_spring.infrastructure.gateways.UsuarioRepositoryGateway;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
    @Bean
    CreateUsuarioInteractor createUsuarioCase(UsuarioGateway usuarioGateway){
        return new CreateUsuarioInteractor(usuarioGateway);
    }

    @Bean
    UsuarioGateway usuarioGateway(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper){
        return new UsuarioRepositoryGateway(usuarioRepository, usuarioEntityMapper);
    }

    @Bean
    UsuarioEntityMapper usuarioEntityMapper(){
        return new UsuarioEntityMapper();
    }

    @Bean
    UsuarioDTOMapper usuarioDTOMapper(){
        return new UsuarioDTOMapper();
    }
}
