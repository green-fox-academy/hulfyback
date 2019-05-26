package com.greenfoxacademy.foxclub.models;

import java.util.List;
import org.springframework.stereotype.Service;

//@Service
public class Fox {
  private String name= "Mr fox";
  private String food;
  private String drink;
  private String trick;
  private Foods foods;
  private Drinks drinks;
  private Tricks tricks;


  public String doIntroduction(String food, String drink, List<String> tricks) {
    return String
        .format("This is %s. Currently living on %s and %s. He knows %d tricks", this.getName(),
            food, drink, tricks.size());
  }

  public Fox() {
    System.out.println();
//    this.name = "Mr. Fox";
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

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getTrick() {
    return trick;
  }

  public void setTrick(String trick) {
    this.trick = trick;
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
