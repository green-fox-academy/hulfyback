package com.greenfoxacademy.springstart.controllers;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloLanguagesController {

  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den",
      "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};

  private String[] colors = {"white", "silver", "gray", "black", "red", "maroon", "yellow", "olive",
      "lime", "green", "aqua", "teal", "blue", "navy", "fuchsia", "purple"};

  @RequestMapping("/web/hello")
  public String sayHello(Model model) {
    int randomNumber = new Random().nextInt(hellos.length);
    int randomColor = new Random().nextInt(colors.length);
    model.addAttribute("hello", hellos[randomNumber]);
    model.addAttribute("size", randomNumber);
    model.addAttribute("color", colors[randomColor]);
    return "sayHello";
  }

}
