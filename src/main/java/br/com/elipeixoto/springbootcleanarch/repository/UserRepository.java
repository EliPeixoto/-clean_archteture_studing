package br.com.elipeixoto.springbootcleanarch.repository;

import br.com.elipeixoto.springbootcleanarch.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
