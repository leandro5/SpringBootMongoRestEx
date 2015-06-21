package net.leandroabreu.springbootmongorestex;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContatoRepository extends MongoRepository<Contato, String> {

}
