package com.example.springbootblogapplication.services;

import com.example.springbootblogapplication.models.Post;
import com.example.springbootblogapplication.repositories.PostRepository;
import com.example.springbootblogapplication.repositories.TagRepository;
import com.example.springbootblogapplication.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PostMapper postMapper;




    public Optional<Post> getById(Long id){
        return postRepository.findById(id);
    }
    public List<Post> getAll(){
        return postRepository.findAll();
    }

    public Post save(Post post){
        if (post.getId() == null){
            post.setCreatedAt(LocalDateTime.now());
        }
        return postRepository.save(post);
    }
}
