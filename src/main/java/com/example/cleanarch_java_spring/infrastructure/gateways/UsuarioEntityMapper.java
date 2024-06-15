package com.example.cleanarch_java_spring.infrastructure.gateways;

import com.example.cleanarch_java_spring.domain.entity.Usuario;
import com.example.cleanarch_java_spring.infrastructure.persistence.UsuarioEntity;

/**
 * O package infrastructure é a camada de implementação
 * Anêmico de regras de negócios, apenas faz uma ponte entre um Domain object/entity e a entidade do banco
 * Usado na lógica para converter um domain User em um User do banco e vice-versa
 */
public class UsuarioEntityMapper {
    UsuarioEntity toEntity(Usuario userDomainObj){
        return new UsuarioEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    Usuario toDomainObj(UsuarioEntity userEntity){
        return new Usuario(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
