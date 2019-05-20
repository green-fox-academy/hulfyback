package com.greenfoxacademy.webshop.models;

public class Item {
  private String name;
  private String description;
  private int price;
  private int quantity;

//  @Override
//  public String toString() {
//    return ("Name: " + this.getName() + "\n" + "Description: " + this.getDescription() + "\n\n");
//  }

  public Item(String name, String description, int price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}
