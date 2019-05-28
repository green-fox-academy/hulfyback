package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.ITodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITodoServiceImp implements ITodoService {
  @Autowired
  private ITodoRepository todoRepository;

  @Override
  public Todo findByID(long id) {
    return todoRepository.findById(id).orElse(null);
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList::add);
    return todoList;
  }
}