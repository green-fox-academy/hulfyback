import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeReaderTest {
  private TicTacToeReader ticTacToeReader = new TicTacToeReader();

  @Test
  void getXWon() {
    ticTacToeReader.readStanding("assets/test2.txt");
    assertEquals("x", ticTacToeReader.getWinner(ticTacToeReader.getStanding()));
    ticTacToeReader.readStanding("assets/test4.txt");
    assertEquals("x", ticTacToeReader.getWinner(ticTacToeReader.getStanding()));
  }

  @Test
  void getOWon() {
    ticTacToeReader.readStanding("assets/test1.txt");
    assertEquals("o", ticTacToeReader.getWinner(ticTacToeReader.getStanding()));
    ticTacToeReader.readStanding("assets/test5.txt");
    assertEquals("o", ticTacToeReader.getWinner(ticTacToeReader.getStanding()));
  }

  @Test
  void isDraw() {
    ticTacToeReader.readStanding("assets/test3.txt");
    assertEquals("draw", ticTacToeReader.getWinner(ticTacToeReader.getStanding()));
  }
}