package com.ecalazaes.workshopmongo.services;

import com.ecalazaes.workshopmongo.entities.User;
import com.ecalazaes.workshopmongo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
