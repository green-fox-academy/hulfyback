public class TicTacToeMain {
  public static void main(String[] args) {
    TicTacToeReader ticTacToeReader = new TicTacToeReader();

    ticTacToeReader.readStanding("assets/draw.txt");
    ticTacToeReader.printWinner(ticTacToeReader.getStanding());
  }
}
