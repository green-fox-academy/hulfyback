package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoubleNumber {
  private int received;
  private int result;

  public DoubleNumber() {
  }

  public DoubleNumber(int received) {
    this.received = received;
    this.result = received * 2;
  }
}