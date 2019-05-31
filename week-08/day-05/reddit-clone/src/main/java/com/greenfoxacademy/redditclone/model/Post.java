package com.greenfoxacademy.redditclone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int votes;
  private String title;
  private String url;

  public Post() {
    this.title = "";
    this.url = "";
    this.votes = 0;
  }

  public Post(String title) {
    this.title = title;
    this.votes = 0;
    this.url = "";
  }
}


