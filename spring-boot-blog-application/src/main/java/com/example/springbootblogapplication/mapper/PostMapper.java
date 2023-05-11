package com.example.springbootblogapplication.mapper;


import com.example.springbootblogapplication.entities.BlogPost;
import com.example.springbootblogapplication.entities.Tag;
import com.example.springbootblogapplication.entities.User;
import com.example.springbootblogapplication.payload.PostRequest;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class PostMapper {

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public BlogPost map(PostRequest postRequest, User user) {
        if (postRequest == null && user == null) {
            return null;
        }
//
//        BlogPostBuilder blogPost = BlogPost.builder();
//
//        if (postRequest != null) {
//            blogPost.id(postRequest.getId());
//            blogPost.title(postRequest.getTitle());
//            blogPost.body(postRequest.getBody());
//            blogPost.tag(postRequest.getTag());
//            blogPost.username(postRequest.getUsername());
//        }
        return null;
    }}
