package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.FoxesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxLoginController {

  @Autowired
  FoxesService foxes;

  @GetMapping("/myfox")
  public String getFox(Model model, @RequestParam String name) {
    model.addAttribute("foxes", foxes);
    model.addAttribute("foxName", name);
    return "fox";
  }


  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String postFox(String foxName) {
    if (!foxes.isFoxInList(foxName)) {
      foxes.addFox(new Fox(foxName));
    }
    return "redirect:/addmeal?name=" + foxName;
  }
}