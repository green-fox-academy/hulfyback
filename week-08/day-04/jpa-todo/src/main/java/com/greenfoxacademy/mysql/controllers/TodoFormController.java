package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoFormController {
  @Autowired
  ITodoService todoService;

  @GetMapping("/addtodo")
  public String getTodo(Model model) {
    model.addAttribute("todos", todoService.findAll());
    return "addtodo";
  }

  @PostMapping("/addtodo")
  public String postTodo(String title) {
    todoService.addTodoByTitle(title);
    return "redirect:/todo";
  }
}