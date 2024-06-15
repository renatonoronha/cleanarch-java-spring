package com.example.cleanarch_java_spring.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * O package infrastructure é a camada de implementação
 * O repository tem dependência com o Jpa
 * O repository faz referência ao UsuarioEntity, a representação da entity no banco
 */
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
