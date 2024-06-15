package com.example.cleanarch_java_spring.infrastructure.controllers;

/**
 * O package infrastructure é a camada de implementação
 */
public record CreateUserRequest(String username, String password, String email) {
}
