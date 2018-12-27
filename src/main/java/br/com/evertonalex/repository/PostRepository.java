package br.com.evertonalex.repository;

import br.com.evertonalex.domain.Post;
import br.com.evertonalex.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
