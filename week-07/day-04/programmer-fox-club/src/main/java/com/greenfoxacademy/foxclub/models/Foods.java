package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class Foods {

  private List<String> foodList;

  public void addFood(String food) {
    this.foodList.add(food);
  }

  public String getRandomFood() {
    return this.foodList.get(new Random().nextInt(this.foodList.size()));
  }

  public Foods() {
    foodList = new ArrayList();
    foodList.add("pizza");
    foodList.add("hamburger");
    foodList.add("salad");
  }

  public List<String> getFoodList() {
    return foodList;
  }
}
