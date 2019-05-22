package com.greenfoxacademy.dependency.controllers;

import com.greenfoxacademy.dependency.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful/colored")
  public String paintBackground(Model model) {
    String color = utilityService.randomColor();
    model.addAttribute("color", color);
    return "index";
  }
}
