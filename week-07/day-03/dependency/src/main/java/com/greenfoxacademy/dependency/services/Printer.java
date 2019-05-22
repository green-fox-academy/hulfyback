package com.greenfoxacademy.dependency.services;

import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Printer {
//    implements CommandLineRunner {
  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }

//  @Override
//  public void run(String... args) throws Exception {
//    System.out.println("SOME SPRING INFO");
//    this.log("hello");
//    System.out.println("SOME SPRING INFO");
//  }
}
