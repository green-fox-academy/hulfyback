package com.greenfoxacademy.redditclone.service;

import com.greenfoxacademy.redditclone.model.Post;
import com.greenfoxacademy.redditclone.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostServiceImp implements IPostService {

  @Autowired
  IPostRepository postRepository;

  @Override
  public void addNewPost(Post post) {
    postRepository.save(post);
  }
}
