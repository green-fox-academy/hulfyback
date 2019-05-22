package com.greenfoxacademy.dependency.controllers;

import com.greenfoxacademy.dependency.services.CoderService;
import com.greenfoxacademy.dependency.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
  @Autowired
  UtilityService utilityService;
  @Autowired
  CoderService coderService;

  @RequestMapping("/useful/colored")
  public String paintBackground(Model model) {
    String color = utilityService.randomColor();
    model.addAttribute("color", color);
    return "index";
  }

  @RequestMapping("/useful/email")
  public String validateEmail(Model model, @RequestParam String email) {
    model.addAttribute("validEmail", utilityService.isValidEmail(email));
    return "validmail";
  }

  @RequestMapping("/useful/encryption")
  public String encoding(Model model, @RequestParam String text, @RequestParam int number) {
    model.addAttribute("encryption", coderService.caesar(text, number));
    return "encryption";
  }
}
