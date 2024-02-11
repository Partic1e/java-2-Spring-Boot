package com.example.demo.model;

import java.util.Date;

public class Post {
    private final String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate) {
        this.text = text;
        this.id = id;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }
}
