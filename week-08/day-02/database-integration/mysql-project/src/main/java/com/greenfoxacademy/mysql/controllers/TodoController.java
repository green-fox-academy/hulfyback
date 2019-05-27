package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}