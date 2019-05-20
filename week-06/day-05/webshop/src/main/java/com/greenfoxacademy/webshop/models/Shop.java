package com.greenfoxacademy.webshop.models;

import java.util.ArrayList;
import java.util.List;

public class Shop {

  private List<Item> itemList;

  public void addItem(Item item) {
    this.itemList.add(item);
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    this.getItemList().forEach(output::append);
    return output.toString();
  }

  public Shop() {
    this.itemList = new ArrayList<>();
  }

  public List<Item> getItemList() {
    return itemList;
  }
}