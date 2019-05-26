package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FoxesService {
  private List<Fox> foxList;

  public void addFox(Fox fox) {
    this.foxList.add(fox);
  }

  public Fox getFoxByName(String name) {
    Fox myFox = new Fox();
    if (!isFoxInList(name)) {
      return null;
    }
    for (Fox fox : foxList) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return myFox;
  }

  public boolean isFoxInList(String name) {
    Optional<Fox> optionalFox= this.getFoxList().stream().filter(fox -> fox.getName().equals(name)).findFirst();
    return optionalFox.isPresent();
  }

  public FoxesService() {
    foxList = new ArrayList<>();
  }

  public List<Fox> getFoxList() {
    return foxList;
  }
}
