package com.ecalazaes.workshopmongo.Controllers;

import com.ecalazaes.workshopmongo.entities.User;
import com.ecalazaes.workshopmongo.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>>  findAll(){
        List<User> list = userService.findAll();
        return ResponseEntity.ok(list);
    }
}
