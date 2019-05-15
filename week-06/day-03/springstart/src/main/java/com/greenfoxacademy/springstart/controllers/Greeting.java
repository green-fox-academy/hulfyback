package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestParam;

public class Greeting {
  private AtomicLong id;
  private String name;

  public Greeting(AtomicLong id, String name) {
    this.id = id;
    this.name = "Hello, " + name;
  }

  public AtomicLong getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
