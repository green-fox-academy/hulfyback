package com.greenfoxacademy.rest.controller;


import com.greenfoxacademy.rest.model.Appender;
import com.greenfoxacademy.rest.model.DoubleNumber;
import com.greenfoxacademy.rest.model.Error;
import com.greenfoxacademy.rest.model.Welcome;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doublingNumber(@RequestParam Optional<Integer> input) {
    if (input.isPresent()) {
      return new DoubleNumber(input.get());
    }
    return new Error("Please provide an input!");
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam Optional<String> name, @RequestParam Optional<String> title) {
    if (!name.isPresent() && !title.isPresent()) {
      return new Error("Please provide a name and a title!");
    }
    if (!name.isPresent()) {
      return new Error("Please provide a name!");
    }
    if (!title.isPresent()) {
      return new Error("Please provide a title!");
    }
    return new Welcome(name.get(), title.get());
  }

  @GetMapping("/appenda/{appendable}")
  public Appender appendable(@PathVariable(name = "appendable") String appendable) {
    return new Appender(appendable);
  }
}
