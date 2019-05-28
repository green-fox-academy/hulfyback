package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.services.ITodoService;
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
  public ITodoService todoService;

  @RequestMapping("/todo")
  public String list(Model model) {
    model.addAttribute("todos", todoService.findAll());
    return "todolist";
  }

  @RequestMapping("/todo/")
  public String listActiveActions(Model model, @RequestParam boolean isActive) {
    Stream<Todo> todoStream = StreamSupport.stream(todoService.findAll().spliterator(), false)
        .filter(todo -> todo.isDone() == isActive);
    model.addAttribute("todos", (Iterable<Todo>) todoStream::iterator);
    return "todolist";
  }
}