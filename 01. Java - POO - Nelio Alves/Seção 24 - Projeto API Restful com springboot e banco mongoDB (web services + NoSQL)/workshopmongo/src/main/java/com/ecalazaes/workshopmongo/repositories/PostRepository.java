package com.ecalazaes.workshopmongo.repositories;

import com.ecalazaes.workshopmongo.entities.Post;
import com.ecalazaes.workshopmongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
