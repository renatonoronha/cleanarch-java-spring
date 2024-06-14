package com.example.cleanarch_java_spring.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {
}
