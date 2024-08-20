package com.ecalazaes.workshopmongo.services;

import com.ecalazaes.workshopmongo.entities.Post;
import com.ecalazaes.workshopmongo.repositories.PostRepository;
import com.ecalazaes.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post findById(String id) {
        return postRepository.findById(id).
                orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }

}
