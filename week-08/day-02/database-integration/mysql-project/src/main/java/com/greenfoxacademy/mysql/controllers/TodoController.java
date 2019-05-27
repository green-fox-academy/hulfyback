package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.TodoRepository;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  public TodoRepository todoRepository;

  @RequestMapping("/todo")
  public String list(Model model) {
//    todoRepository.save(new Todo("Start the day", true, false));
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @RequestMapping("/todo/")
  public String listActiveActions(Model model, @RequestParam boolean isActive) {
    Stream<Todo> todoStream = StreamSupport.stream(todoRepository.findAll().spliterator(), false)
        .filter(todo -> todo.isDone() == isActive);
    model.addAttribute("todos", (Iterable<Todo>) todoStream::iterator);
    return "todolist";
  }
}