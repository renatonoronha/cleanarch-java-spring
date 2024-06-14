package com.example.cleanarch_java_spring.infrastructure.gateways;

import com.example.cleanarch_java_spring.domain.entity.Usuario;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioEntity;

public class UsuarioEntityMapper {
    UsuarioEntity toEntity(Usuario userDomainObj){
        return new UsuarioEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    Usuario toDomainObj(UsuarioEntity userEntity){
        return new Usuario(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
