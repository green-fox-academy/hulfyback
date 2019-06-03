package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Welcome {
  private String welcome_message;

  public Welcome(String name, String title) {
    this.welcome_message = String.format("Oh, hi there %s, my dear %s!", name, title);
  }
}
