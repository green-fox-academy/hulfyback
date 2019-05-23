package com.greenfoxacademy.foxclub.models;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Fox {
  private String name;
  private Foods foods;
  private Drinks drinks;
  private Tricks tricks;


  public String doIntroduction(String food, String drink, List<String> tricks) {
    return String
        .format("This is %s. Currently living on %s and %s. He knows %d tricks", this.getName(),
            food, drink, tricks.size());
  }

  public Fox() {
    this.name = "Mr. Fox";
    this.name = name;
    this.foods = new Foods();
    this.drinks = new Drinks();
    this.tricks = new Tricks();
  }

  public Fox(String name) {
    this.name = name;
    this.foods = new Foods();
    this.drinks = new Drinks();
    this.tricks = new Tricks();
  }

  public String getName() {
    return name;
  }

  public Foods getFoods() {
    return foods;
  }

  public Drinks getDrinks() {
    return drinks;
  }

  public Tricks getTricks() {
    return tricks;
  }
}
