package com.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.server.models.Role;
import com.server.pojo.Roles;
import com.server.repo.RoleRepository;

@SpringBootApplication
public class RestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(RoleRepository roleRepository) {

	    return args -> {

	        Role adminRole = roleRepository.findByRole(Roles.ADMIN.name());
	        if (adminRole == null) {
	            Role newAdminRole = new Role();
	            newAdminRole.setRole(Roles.ADMIN.name());
	            roleRepository.save(newAdminRole);
	        }
	        Role basicRole = roleRepository.findByRole(Roles.BASIC.name());
	        if (basicRole == null) {
	            Role newBasicRole = new Role();
	            newBasicRole.setRole(Roles.BASIC.name());
	            roleRepository.save(newBasicRole);
	        }
	    };

	}
}
