package com.example.springbootblogapplication.repositories;

import com.example.springbootblogapplication.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    boolean existsByName(String tagName);
    Tag findByTagName(String tagName);
}
