package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxMealController {
  @Autowired
  FoxesService foxes;

  @GetMapping("/addmeal")
public String getMeal(Model model, @RequestParam String name) {
    model.addAttribute("foxes", foxes);
    model.addAttribute("foxName", name);
    return "nutrition_select_form";
  }

  @PostMapping("/addmeal")
  public String postMeal( @RequestParam String name, String foodName, String drinkName) {
    foxes.getFoxByName(name).setFood(foodName);
    foxes.getFoxByName(name).setDrink(drinkName);
    return "redirect:/myfox?name=" + name;
  }
}