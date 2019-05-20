package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

  private BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/start")
  public String init(Model model) {
    model.addAttribute("account", bankAccount);
    return "index";
  }
}
