package com.example.springbootblogapplication.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="blog_posts")

public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")
    private Long postId;

    @Column(name="title")
    private String title;

    @CreationTimestamp
    @Column(name="time_stamp")
    private LocalDateTime creationTimeStamp;

    @Column(name="body")
    private String body;

    @Lob
    @Column(name="full_post", length = 666000)
    private String fullPost;

    @Column(name="username")
    private String username;

    @ManyToMany
    @JoinTable(name = "post_tags",
            joinColumns = @JoinColumn(name = "post_id", referencedColumnName = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
        @JsonIgnoreProperties("blogPosts")
        private Set<Tag> tags;

            @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "account_id", referencedColumnName = "id")
            private User user;

}
