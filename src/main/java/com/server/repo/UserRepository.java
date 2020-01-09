package com.server.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.server.models.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
