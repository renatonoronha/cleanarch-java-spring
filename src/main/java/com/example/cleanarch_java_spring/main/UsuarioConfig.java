package com.example.cleanarch_java_spring.main;

import com.example.cleanarch_java_spring.application.gateways.UsuarioGateway;
import com.example.cleanarch_java_spring.application.usecases.CreateUsuarioInteractor;
import com.example.cleanarch_java_spring.infrastructure.controllers.UsuarioDTOMapper;
import com.example.cleanarch_java_spring.infrastructure.gateways.UsuarioEntityMapper;
import com.example.cleanarch_java_spring.infrastructure.gateways.UsuarioRepositoryGateway;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Contém todos os Beans que devem ser injetados; Realiza a injeção das dependências de cada componente/classe
 * Cria todas as dependências e injeta elas
 * Se for necessário trocar de framework ou controlar a injeção de outra forma, como essa classe está em uma
 *      camada externa, podemos fazer essa implementação aqui e as regras de negócio não são afetadas
 */
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
