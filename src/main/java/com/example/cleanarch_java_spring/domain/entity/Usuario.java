package com.example.cleanarch_java_spring.domain.entity;

/**
 * Entidade de uma regra de negócio
 * É a abstração de um objeto do database
 * @param username
 * @param password
 * @param email
 */
public record Usuario(String username, String password, String email) {
}
