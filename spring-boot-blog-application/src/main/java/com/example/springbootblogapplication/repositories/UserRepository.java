package com.example.springbootblogapplication.repositories;

import com.example.springbootblogapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username); // this is the method that will be used to find the user by username

    Boolean existsByUsername(String username); // this is the method that will be used to check if the user exists by username

    Boolean existsByEmail(String email); // this is the method that will be used to check if the user exists by email
}
