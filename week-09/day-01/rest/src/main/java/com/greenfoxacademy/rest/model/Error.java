package com.greenfoxacademy.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {
  private String error;

  public Error(String errorMessage) {
    this.error = errorMessage;
  }
}
