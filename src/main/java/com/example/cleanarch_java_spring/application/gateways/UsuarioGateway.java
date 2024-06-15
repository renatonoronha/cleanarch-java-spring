package com.example.cleanarch_java_spring.application.gateways;

import com.example.cleanarch_java_spring.domain.entity.Usuario;

/**
 * Também conhecido como porta ou port
 * Interface para nos comunicarmos com as camadas externas, que nesse caso vai ser a camada de persistência
 * Um gateway é um portão de entrada. UsuarioGateway vai ser uma estrutura genérica que vai permitir criar um usuario
 * Está abstraindo detalhe de implementação: posso criar esse usuario por um repository, chamando um webservice, escrevendo um arquivo
 * O que precisa definir nessa interface é a assinatura da operação de criação de usuario
 */
public interface UsuarioGateway {
    Usuario createUser(Usuario usuario);
}
