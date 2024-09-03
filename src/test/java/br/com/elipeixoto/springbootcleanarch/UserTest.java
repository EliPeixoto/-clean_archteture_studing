package br.com.elipeixoto.springbootcleanarch;

import br.com.elipeixoto.springbootcleanarch.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserTest {
    @Test
    void deveCriarUsuarioComSucesso(){
        User user = new User(1L, "testeUser", "senha123","emailteste@exemplo.com.br");
        assertEquals(1L, user.getId());
        assertEquals("testeUser", user.getUsername());
        assertEquals("senha123", user.getPassword());
        assertEquals("emailteste@exemplo.com.br", user.getEmail());
    }

}
