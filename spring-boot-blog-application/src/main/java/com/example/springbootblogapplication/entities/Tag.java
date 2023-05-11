package com.example.springbootblogapplication.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tag_name")
    @NotBlank
    private String tagName;

    @Column(name = "post_id")
    private Long postId;

    @ManyToMany
    @JsonIgnoreProperties("tags")
    private Set<BlogPost> blogPosts = new HashSet<>();
}
