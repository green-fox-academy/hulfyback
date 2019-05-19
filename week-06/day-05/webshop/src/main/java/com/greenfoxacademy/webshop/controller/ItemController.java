package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.Item;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemController {

  private List<Item> items = Arrays.asList(new Item("Running Shoes", "Nike running shoes for every day sport", 1000, 5),
      new Item("Printer", "Seome HP printer that will print pages", 3000, 2),
      new Item("Coca Cola", "0.5dl standard coke", 25, 0),
      new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100),
      new Item("T-shirt", "Blue with a corgi on a bike", 300, 1)
      );

//  private Shop creatNewShop() {
//    Shop shop = new Shop();
//    shop.addItem(new Item("Running Shoes", "Nike running shoes for every day sport", 1000, 5));
//    shop.addItem(new Item("Printer", "Seome HP printer that will print pages", 3000, 2));
//    shop.addItem(new Item("Coca Cola", "0.5dl standard coke", 25, 0));
//    shop.addItem(new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
//    shop.addItem(new Item("T-shirt", "Blue with a corgi on a bike", 300, 1));
//    return shop;
//  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String listing(Model model) {
//    items = creatNewShop().getItemList();
    model.addAttribute("items", items);
    return "index";
  }

  @RequestMapping("/average")
  public String getAverage() {
//    items = creatNewShop().getItemList();
//    IntSummaryStatistics average = items
//        .stream()
//        .collect(Collectors.averagingDouble(item -> i))
    return "average";
  }

  @RequestMapping("/expensive")
  public String getMostExpensive(Model model) {
    Optional<Item> shopItem = items.stream().max(Comparator.comparing(Item::getPrice));
    String name = shopItem.get().getName();
    model.addAttribute("name", name);
    return "expensive";
  }

  @RequestMapping("/sorted")
  public String getSortedItems(Model model) {
    List<Item> shopItems = items.stream().sorted(Comparator.comparing(Item::getPrice)).collect(
        Collectors.toList());
    model.addAttribute("items", shopItems);

    return "sorted";
  }
}