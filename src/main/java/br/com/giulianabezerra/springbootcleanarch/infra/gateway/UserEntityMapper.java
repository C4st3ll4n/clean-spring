package br.com.giulianabezerra.springbootcleanarch.infra.gateway;

import br.com.giulianabezerra.springbootcleanarch.domain.entity.UserEntity;
import br.com.giulianabezerra.springbootcleanarch.infra.persistence.UserModel;

public class UserEntityMapper {
    static UserModel toModel(UserEntity userEntity){
        return new UserModel(userEntity.username(), userEntity.password(), userEntity.email());
    }

    static UserEntity toEntity(UserModel userModel){
        return new UserEntity(userModel.getUsername(),userModel.getPassword(), userModel.getEmail());
    }
}
