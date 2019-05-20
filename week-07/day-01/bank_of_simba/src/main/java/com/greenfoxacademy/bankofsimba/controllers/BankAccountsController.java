package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountsController {

  private List<BankAccount> bankAccountList = Arrays.asList(
      new BankAccount("Simba", 2000, "lion", true, false),
      new BankAccount("Timon", 125, "surikata", false, false),
      new BankAccount("Pumbaa", 88, "boar", false, false),
      new BankAccount("Zazu", 1125, "hornbill", false, false),
      new BankAccount("Scar", 587.25, "lion", false, true)
  );

  @RequestMapping("/start")
  public String init(Model model) {
    model.addAttribute("accounts", bankAccountList);
    return "index";
  }
}