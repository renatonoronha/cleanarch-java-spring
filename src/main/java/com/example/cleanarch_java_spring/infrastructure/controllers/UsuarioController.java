package com.example.cleanarch_java_spring.infrastructure.controllers;

import com.example.cleanarch_java_spring.application.usecases.CreateUsuarioInteractor;
import com.example.cleanarch_java_spring.domain.entity.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    private final CreateUsuarioInteractor createUsuarioInteractor;
    private final UsuarioDTOMapper usuarioDTOMapper;

    public UsuarioController(CreateUsuarioInteractor createUsuarioInteractor, UsuarioDTOMapper usuarioDTOMapper){
        this.createUsuarioInteractor = createUsuarioInteractor;
        this.usuarioDTOMapper = usuarioDTOMapper;
    }

    @PostMapping("/")
    public CreateUserResponse saveUser(@RequestBody CreateUserRequest request){
        Usuario usuarioBusinessObj = usuarioDTOMapper.toUser(request);
        Usuario user = createUsuarioInteractor.createUser(usuarioBusinessObj);
        return usuarioDTOMapper.toResponse(user);
    }

}
