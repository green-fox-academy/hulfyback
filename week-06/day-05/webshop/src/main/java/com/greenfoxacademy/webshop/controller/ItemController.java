package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.Item;
import com.greenfoxacademy.webshop.model.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemController {

  private Shop items;

  private Shop creatNewShop() {
    Shop shop = new Shop();
    shop.addItem(new Item("Running Shoes", "Nike running shoes for every day sport", 1000, 5));
    shop.addItem(new Item("Printer", "Seome HP printer that will print pages", 3000, 2));
    shop.addItem(new Item("Coca Cola", "0.5dl standard coke", 25, 0));
    shop.addItem(new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
    shop.addItem(new Item("T-shirt", "Blue with a corgi on a bike", 300, 1));
    return shop;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String listing(Model model) {
    items = creatNewShop();
    model.addAttribute("items", items);
    return "index";
  }

  @RequestMapping("/average")
  public String getAverage() {
    return "average";
  }
}