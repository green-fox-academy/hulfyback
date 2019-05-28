package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Todo;
import java.util.List;

public interface ITodoService {

  Todo findByID(long id);

  void addTodoByTitle(String title);

  List<Todo> findAll();
}
