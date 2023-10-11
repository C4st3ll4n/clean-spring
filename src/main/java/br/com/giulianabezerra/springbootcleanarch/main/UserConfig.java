package br.com.giulianabezerra.springbootcleanarch.main;

import br.com.giulianabezerra.springbootcleanarch.data.gateway.UserGateway;
import br.com.giulianabezerra.springbootcleanarch.data.usecase.CreateUserInteractor;
import br.com.giulianabezerra.springbootcleanarch.infra.gateway.UserGatewayRepository;
import br.com.giulianabezerra.springbootcleanarch.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserInteractor(UserGateway userGateway){
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository){
        return new UserGatewayRepository(userRepository);
    }

}
