package com.educandoweb.Curso.resources;

import com.educandoweb.Curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Erick", "ecs@gmail.com", "988420291", "12345");
        return ResponseEntity.ok().body(u);
    }
}
