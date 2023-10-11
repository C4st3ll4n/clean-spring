package br.com.giulianabezerra.springbootcleanarch.infra.controller;

import br.com.giulianabezerra.springbootcleanarch.data.usecase.CreateUserInteractor;
import br.com.giulianabezerra.springbootcleanarch.domain.entity.UserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
  private final CreateUserInteractor userInteractor;

  public UserController(CreateUserInteractor userInteractor) {
    this.userInteractor = userInteractor;
  }

  @PostMapping
  CreateUserResponse create(@RequestBody CreateUserRequest request) {
    UserEntity entity = UserDTOMapper.toEntity(request);
    entity = userInteractor.createUser(entity);
    return UserDTOMapper.toResponse(entity);
  }
}
