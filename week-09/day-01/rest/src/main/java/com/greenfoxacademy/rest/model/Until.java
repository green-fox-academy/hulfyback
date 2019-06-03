package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Until {

  private int until;

  public Until() {
  }

  public Until(int until) {
    this.until = until;
  }
}
