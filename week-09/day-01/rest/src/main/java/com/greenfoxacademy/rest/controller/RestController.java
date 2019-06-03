package com.greenfoxacademy.rest.controller;


import com.greenfoxacademy.rest.model.Appender;
import com.greenfoxacademy.rest.model.DoubleNumber;
import com.greenfoxacademy.rest.model.Error;
import com.greenfoxacademy.rest.model.Result;
import com.greenfoxacademy.rest.model.Until;
import com.greenfoxacademy.rest.model.Welcome;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
  public Object greeting(@RequestParam Optional<String> name,
      @RequestParam Optional<String> title) {
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

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.POST)
  public Appender postAppendable(@PathVariable(name = "appendable") String appendable, @RequestBody Appender appender) {
    Appender app = new Appender();
    app.append(appender.getAppended());
    return app;
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(name = "action") String action, @RequestBody Until until) {
    Result result = new Result();
    if (action.equals("sum")) {
      result.sum(until.getUntil());
    } else if (action.equals("factor")) {
      result.factor(until.getUntil());
    } else {
      return new Error("Please provide a number");
    }
    return result;
  }
}