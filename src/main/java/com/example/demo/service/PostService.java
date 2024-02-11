package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts(){
        return posts;
    }

    {
        posts.add(new Post(1L, "some text", new Date()));
        posts.add(new Post(2L, "same text", new Date()));
        posts.add(new Post(3L, "111",new Date()));
    }

    public void create(String text) {
        long newId = posts.size() + 1;
        posts.add(new Post(newId,text, new Date()));
    }
}
