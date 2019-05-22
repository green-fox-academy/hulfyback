package com.greenfoxacademy.dependency.services.colors;

import com.greenfoxacademy.dependency.services.ColorableInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GreenColor")
public class GreenColor implements ColorableInterface {

  @Override
  public void printColor() {
    System.out.println("It is a green color...");
  }
}