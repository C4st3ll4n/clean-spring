package br.com.giulianabezerra.springbootcleanarch.infra.persistence;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {

}
