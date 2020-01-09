package com.server.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.server.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
