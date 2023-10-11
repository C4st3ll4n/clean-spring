package br.com.giulianabezerra.springbootcleanarch.data.gateway;

import br.com.giulianabezerra.springbootcleanarch.domain.entity.UserEntity;

public interface UserGateway {

    UserEntity createUser(UserEntity userEntity);
}
