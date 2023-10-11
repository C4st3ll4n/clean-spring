package br.com.giulianabezerra.springbootcleanarch.infra.controller;

import br.com.giulianabezerra.springbootcleanarch.domain.entity.UserEntity;

public class UserDTOMapper {
    static CreateUserResponse toResponse(UserEntity entity) {
        return new CreateUserResponse(entity.username(), entity.email());
    }

    static UserEntity toEntity(CreateUserRequest request) {
        return new UserEntity(request.username(), request.password(), request.email());
    }
}
