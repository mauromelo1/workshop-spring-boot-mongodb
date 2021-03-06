package com.mauromelo1.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mauromelo1.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
