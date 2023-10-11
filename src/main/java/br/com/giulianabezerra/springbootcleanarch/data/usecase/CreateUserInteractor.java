package br.com.giulianabezerra.springbootcleanarch.data.usecase;

import br.com.giulianabezerra.springbootcleanarch.data.gateway.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.UserEntity;

public class CreateUserInteractor {

    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public UserEntity createUser(UserEntity entity) {
        return userGateway.createUser(entity);
    }
}
