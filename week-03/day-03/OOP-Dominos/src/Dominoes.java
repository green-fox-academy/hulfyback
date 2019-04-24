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
}
