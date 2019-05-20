package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

  private BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
  private List<BankAccount> bankAccountList = Arrays.asList(bankAccount);

  @RequestMapping("/start")
  public String init(Model model) {
    model.addAttribute("accounts", bankAccountList);
    return "index";
  }

  @RequestMapping("/html")
  public String htmlCeption(Model model) {
    String newString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("string", newString);
    return "formatted";
  }
}