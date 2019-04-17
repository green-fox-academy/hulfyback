import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...


    System.out.println(dominoes);

    System.out.println(reorderDominos(dominoes));
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
  static List<Domino> reorderDominos(List<Domino> dominos) {
    List<Domino> orderedDominos = new ArrayList<>();

    orderedDominos.add(dominos.get(0));
    dominos.remove(0);

    while (true) {
      int i = 0;

      while(true) {
        if (orderedDominos.get(orderedDominos.size() - 1).getRightSide() == dominos.get(i).getLeftSide()) {
          orderedDominos.add(dominos.get(i));
          dominos.remove(i);
          break;
        }
        i++;
      }
      if(dominos.isEmpty()) {
        break;
      }
    }
    return orderedDominos;
  }
}
