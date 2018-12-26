package br.com.evertonalex.resources;

import br.com.evertonalex.domain.User;
import br.com.evertonalex.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){ //usando o ResponseEntity retorna um objeto com parametros http
       List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }
}
