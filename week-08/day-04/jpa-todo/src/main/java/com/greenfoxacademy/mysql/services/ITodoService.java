package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Todo;
import java.util.List;

public interface ITodoService {

  void update(long id, String title);
  void removeTodoById(long id);
  void addTodoByTitle(String title);
  List<Todo> findAll();
  List<Todo> findAllOrderByIdDesc();
  List<Todo> findAllOrderById();
}
