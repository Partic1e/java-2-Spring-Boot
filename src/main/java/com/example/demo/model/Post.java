package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;

@Entity
public class Post implements Serializable {
    private String text;
    @Column(nullable = false)
    private Integer likes;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date creationDate;
    @Id
    @GeneratedValue
    private Long id;

    public Post() {

    }

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
