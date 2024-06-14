package com.example.cleanarch_java_spring.repository;

import com.example.cleanarch_java_spring.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
