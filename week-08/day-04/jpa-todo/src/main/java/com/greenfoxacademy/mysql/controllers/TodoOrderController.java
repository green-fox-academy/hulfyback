package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoOrderController {

  @Autowired
  ITodoService todoService;

  @RequestMapping(value = {"/ordering"} ,method = RequestMethod.POST)
  public String getTodosOrder(Model model, @RequestParam(name = "orderedby") String orderedby) {
    switch (orderedby) {
      case "decreasing":
        model.addAttribute("todos", todoService.findAllOrderByIdDesc());
        break;
      default:
        model.addAttribute("todos", todoService.findAllOrderById());
        break;
      }
    return "todolist";
  }
}
