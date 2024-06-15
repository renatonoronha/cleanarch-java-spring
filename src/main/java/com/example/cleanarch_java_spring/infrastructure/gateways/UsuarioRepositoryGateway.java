package com.example.cleanarch_java_spring.infrastructure.gateways;

import com.example.cleanarch_java_spring.application.gateways.UsuarioGateway;
import com.example.cleanarch_java_spring.domain.entity.Usuario;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioEntity;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioRepository;

/**
 * O package infrastructure é a camada de implementação
 * É a implementação da interface UsuarioGateway; É a implementação da abstração de uma camada mais interna
 * Esse Gateway vai interagir com um repository do Jpa
 * Pra fazer a implementação do Gateway, vai precisar chamar o Repository pra criar o usuario
 * Esse é um Gateway que apenas usa o Repository pra criar o usuario no banco
 * É uma boa prática declarar os campos de injeção como 'final', para que apenas eles sejam criados através da injeção
 * É a implementação da lógica
 */
public class UsuarioRepositoryGateway implements UsuarioGateway {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;

    public UsuarioRepositoryGateway(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper){
        this.usuarioRepository = usuarioRepository;
        this.usuarioEntityMapper = usuarioEntityMapper;
    }

    /**
     * O repository está dependendo da entidade do banco, não da domain entity, então não podemos passar 'Usuario' como param
     * @param userDomainObj - domain User, aquele que é o core do sistema
     * @return a Entity convertida em um domain object, porque essa classe é a implementação de uma abstração de um use case,
     *      portanto tem que manter livre de dependências de camadas mais externas
     */
    @Override
    public Usuario createUser(Usuario userDomainObj) {
        UsuarioEntity usuarioEntity = usuarioEntityMapper.toEntity(userDomainObj);
        UsuarioEntity savedObj = usuarioRepository.save(usuarioEntity);
        return usuarioEntityMapper.toDomainObj(savedObj);
    }
}
