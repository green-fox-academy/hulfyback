package com.greenfoxacademy.dependency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrinterController {

  @Autowired
  CommandLineRunner commandLineRunner;

  @GetMapping("/")
  @ResponseBody
  public String printLog() throws Exception {
    commandLineRunner.run();
    return " ";
  }
}
