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
  public void update(long id, String title) {
    Todo todoInDb = todoRepository.findById(id).get();
    todoInDb.setTitle(title);
    todoRepository.save(todoInDb);
  }

  @Override
  public void removeTodoById(long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public void addTodoByTitle(String title) {
    Todo todo = new Todo(title);
    todoRepository.save(todo);
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList::add);
    return todoList;
  }


}