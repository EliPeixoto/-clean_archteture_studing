package br.com.elipeixoto.springbootcleanarch.application.usecases;

import br.com.elipeixoto.springbootcleanarch.application.gateways.UserGateway;
import br.com.elipeixoto.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createrUser(user);

    }
}
