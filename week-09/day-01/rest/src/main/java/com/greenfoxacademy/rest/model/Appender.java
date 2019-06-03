package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Appender {

  private String appended;

  public Appender() {
  }

  public Appender(String prefix) {
    this.appended = prefix.concat("a");
  }

  public void append(String prefix) {
    this.appended = prefix.concat("a");
  }
}