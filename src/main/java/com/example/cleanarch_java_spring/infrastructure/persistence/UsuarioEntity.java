package com.example.cleanarch_java_spring.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.*;

/**
 * O package infrastructure é a camada de implementação
 * É a representação da entity no banco
 * Pode usar annotations nessa classe, porque é uma camada externa, ela é um ADAPTER
 */
@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
public class UsuarioEntity {

    public UsuarioEntity(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
}
