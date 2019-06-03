package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayHandler {
  private String what;
  private int[] numbers;

  public int sumNumbers(int[] numbers) {
    int sum = 0;
    for (int i: numbers) {
      sum += i;
    }
    return sum;
  }

  public int multiplyNumbers(int[] numbers) {
    int multiply = 1;
    for (int i: numbers) {
      multiply *= i;
    }
    return multiply;
  }

  public int[] doubleNumbers(int[] numbers) {
    int[] doubles = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      doubles[i] = numbers[i] * 2;
    }
    return doubles;
  }

  public ArrayHandler() {
  }
}
