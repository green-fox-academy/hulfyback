import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Dominoes dominoes = new Dominoes();

    dominoes.addDomino(new Domino(5, 2));
    dominoes.addDomino(new Domino(4, 6));
    dominoes.addDomino(new Domino(1, 5));
    dominoes.addDomino(new Domino(6, 7));
    dominoes.addDomino(new Domino(2, 4));
    dominoes.addDomino(new Domino(7, 1));

    Collections.sort(dominoes.getDominoList());

    System.out.println(dominoes.getDominoList().toString());
  }
}
