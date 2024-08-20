package com.ecalazaes.workshopmongo.controllers;

import com.ecalazaes.workshopmongo.dto.UserDTO;
import com.ecalazaes.workshopmongo.entities.Post;
import com.ecalazaes.workshopmongo.entities.User;
import com.ecalazaes.workshopmongo.services.PostService;
import com.ecalazaes.workshopmongo.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping( "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post post = postService.findById(id);
        return ResponseEntity.ok(post);
    }
}
