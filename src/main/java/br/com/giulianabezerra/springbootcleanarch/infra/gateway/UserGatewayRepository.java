package br.com.giulianabezerra.springbootcleanarch.infra.gateway;

import br.com.giulianabezerra.springbootcleanarch.data.gateway.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.UserEntity;
import br.com.giulianabezerra.springbootcleanarch.infra.persistence.UserModel;
import br.com.giulianabezerra.springbootcleanarch.infra.persistence.UserRepository;

public class UserGatewayRepository implements UserGateway {

    public UserGatewayRepository(UserRepository repository) {
        this.repository = repository;
    }

    private final UserRepository repository;


    @Override
    public UserEntity createUser(UserEntity userEntity) {
        UserModel model = UserEntityMapper.toModel(userEntity);
        model = repository.save(model);
        return UserEntityMapper.toEntity(model);
    }
}
