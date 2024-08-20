package com.ecalazaes.workshopmongo.services;

import com.ecalazaes.workshopmongo.entities.User;
import com.ecalazaes.workshopmongo.repositories.UserRepository;
import com.ecalazaes.workshopmongo.services.exception.ObjectNotFoundException;
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

    public User findById(String id) {
        return userRepository.findById(id).
                orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
    }
}
