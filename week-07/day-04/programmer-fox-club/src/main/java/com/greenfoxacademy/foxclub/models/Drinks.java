package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class Drinks {
  private List<String> drinkList;

  public void addDrink(String drink) {
    this.drinkList.add(drink);
  }

  public String getRandomDrink() {
    return this.drinkList.get(new Random().nextInt(this.drinkList.size()));
  }

  public Drinks() {
    drinkList = new ArrayList<>();

    drinkList.add("limonade");
    drinkList.add("beer");
  }

  public List<String> getDrinkList() {
    return drinkList;
  }
}
