package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLCeptionControlller {

  @RequestMapping("/html")
  public String htmlCeption(Model model) {
    String newString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("string", newString);
    return "formatted";
  }
}