package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Drinks;
import com.greenfoxacademy.foxclub.models.Foods;
import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxWebController {

//  @Autowired
//  Foods foods;
//
//  @Autowired
//  Tricks tricks;
//
//  @Autowired
//  Drinks drinks;

  @Autowired
  Fox fox;

//  @RequestMapping("/myfox")
//  public String showFox(Model model) {
//    model.addAttribute("fox", fox);
//    return "fox";
//  }

  @GetMapping("/myfox")
  public String getFox(Model model, @RequestParam(required = false) String name) {
    Fox fox = new Fox(name);
    model.addAttribute("fox", fox);
    return "fox";
  }

  @GetMapping("/login")
  public String login(Model model, @RequestParam(required = false) String name) {
//    Fox fox = new Fox(name);
//    model.addAttribute("fox", fox);
    return "login";
  }

  @PostMapping("/login")
  public String postFox(String name) {
    return "redirect:/myfox?name=" + name;
  }
}
