package com.ecalazaes.workshopmongo.repositories;

import com.ecalazaes.workshopmongo.entities.Post;
import com.ecalazaes.workshopmongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
