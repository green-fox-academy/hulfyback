package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class Tricks {
  private List<String> trickList;

  public void addTrick(String trick) {
    this.trickList.add(trick);
  }

  public String getRandomTrick() {
    return this.trickList.get(new Random().nextInt(this.trickList.size()));
  }

  public Tricks() {
    trickList = new ArrayList<>();
    trickList.add("alcoholic");
    trickList.add("dancing");
  }

  public List<String> getTrickList() {
    return trickList;
  }
}
