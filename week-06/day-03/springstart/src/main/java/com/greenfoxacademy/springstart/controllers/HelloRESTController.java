package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  private static AtomicLong counter = new AtomicLong(0);

  @RequestMapping
  public Greeting greeting(@RequestParam("name") String name) {
    return new Greeting(new AtomicLong(counter.incrementAndGet()), name);
  }
}
