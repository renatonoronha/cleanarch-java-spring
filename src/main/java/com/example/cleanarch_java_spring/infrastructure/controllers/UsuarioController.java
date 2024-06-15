package com.example.cleanarch_java_spring.infrastructure.controllers;

import com.example.cleanarch_java_spring.application.usecases.CreateUsuarioInteractor;
import com.example.cleanarch_java_spring.domain.entity.Usuario;
import org.springframework.web.bind.annotation.*;

/**
 * O package infrastructure é a camada de implementação
 * Como o controller tem integração com o Spring, ele fica na camada de infrastructure
 * Utiliza o caso de uso. Se tivesse usando interface no use case, colocaria a interface aqui em vez da implementação diretamente
 * UsuarioDTOMapper é utilizado para converter o domain object User em um DTO
 */
@RestController
@RequestMapping("/user")
public class UsuarioController {
    private final CreateUsuarioInteractor createUsuarioInteractor;
    private final UsuarioDTOMapper usuarioDTOMapper;

    public UsuarioController(CreateUsuarioInteractor createUsuarioInteractor, UsuarioDTOMapper usuarioDTOMapper){
        this.createUsuarioInteractor = createUsuarioInteractor;
        this.usuarioDTOMapper = usuarioDTOMapper;
    }

    /**
     * createUsuarioInteractor.createUser() recebe um domain object User como param
     * UsuarioDTOMapper é utilizado para converter a request que seria um DTO em um domain object User
     *      e um domain object User em response que seria também DTO
     * Basicamente, request e response são DTO's com corpos diferentes e a classe UsuarioDTOMapper realiza a conversão
     *      de DTO para domain object e vice-versa
     * @param request - requisição HTTP
     * @return um response com username e email
     */
    @PostMapping("/")
    public CreateUserResponse saveUser(@RequestBody CreateUserRequest request){
        Usuario usuarioBusinessObj = usuarioDTOMapper.toUser(request);
        Usuario user = createUsuarioInteractor.createUser(usuarioBusinessObj);
        return usuarioDTOMapper.toResponse(user);
    }

}
