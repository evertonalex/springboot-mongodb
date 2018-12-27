package br.com.evertonalex.repository;

import br.com.evertonalex.domain.Post;
import br.com.evertonalex.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

    List<Post> findByTitleContainingIgnoreCase(String text);

}
