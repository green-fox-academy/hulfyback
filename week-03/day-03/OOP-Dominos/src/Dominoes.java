import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  private List<Domino> dominoList;

  public List<Domino> getDominoList() {
    return dominoList;
  }

  public Dominoes() {
    this.dominoList = new ArrayList<>();
  }

  public void addDomino(Domino domino) {
    dominoList.add(domino);
  }

  public List<Domino> reorderDominos(List<Domino> dominos) {
    List<Domino> orderedDominos = new ArrayList<>();

    orderedDominos.add(dominos.get(0));
    dominos.remove(0);

    while (true) {
      int i = 0;

      while (true) {
        if (orderedDominos.get(orderedDominos.size() - 1).getRightSide() == dominos.get(i).getLeftSide()) {
          orderedDominos.add(dominos.get(i));
          dominos.remove(i);
          break;
        }
        i++;
      }
      if (dominos.isEmpty()) {
        break;
      }
    }
    return orderedDominos;
  }
}