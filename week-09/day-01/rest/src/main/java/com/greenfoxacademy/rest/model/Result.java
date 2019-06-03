package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

  private int result;

  public Result() {
  }

  public Result(int result) {
    this.result = result;
  }

  public void sum(int until) {
    int sum = 0;
    for (int i = 1; i <= until ; i++) {
      sum += i;
    }
    this.result = sum;
  }

  public void factor(int until) {
    int factor = 1;
    for (int i = 1; i < until ; i++) {
      factor *= i;
    }
    this.result = factor;
  }
}
