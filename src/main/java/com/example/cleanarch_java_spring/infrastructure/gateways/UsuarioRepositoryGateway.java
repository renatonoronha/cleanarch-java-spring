package com.example.cleanarch_java_spring.infrastructure.gateways;

import com.example.cleanarch_java_spring.application.gateways.UsuarioGateway;
import com.example.cleanarch_java_spring.domain.entity.Usuario;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioEntity;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioRepository;

public class UsuarioRepositoryGateway implements UsuarioGateway {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;

    public UsuarioRepositoryGateway(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper){
        this.usuarioRepository = usuarioRepository;
        this.usuarioEntityMapper = usuarioEntityMapper;
    }

    @Override
    public Usuario createUser(Usuario userDomainObj) {
        UsuarioEntity usuarioEntity = usuarioEntityMapper.toEntity(userDomainObj);
        UsuarioEntity savedObj = usuarioRepository.save(usuarioEntity);
        return usuarioEntityMapper.toDomainObj(savedObj);
    }
}
