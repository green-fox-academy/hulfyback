package main.scoreboard;

import main.scoreboard.interfaces.TennisGameInterface;

public class TennisGame1 implements TennisGameInterface {

  private TennisPlayer tennisPlayer1;
  private TennisPlayer tennisPlayer2;

  public void wonPoint(TennisPlayer tennisPlayer) {
    tennisPlayer.addScore();
  }

  public String getScore() {
    if (this.getTennisPlayer2().getScore() == this.getTennisPlayer2().getScore()) {
      if (this.getTennisPlayer2().getScore() < 4) {
        return SCORES[this.getTennisPlayer1().getScore()].concat(ALL);
      } else {
        return SCORES[4];
      }
    } else if (this.getTennisPlayer1().getScore() >= 4 || this.getTennisPlayer2().getScore() >= 4) {
      switch (this.getTennisPlayer1().compareTo(this.getTennisPlayer2())) {
        case 2:
          return WIN + this.getTennisPlayer1().getName();
        case 1:
          return ADVANTAGE + this.getTennisPlayer1().getName();
        case -1:
          return ADVANTAGE + this.getTennisPlayer2().getName();
        default:
          return WIN + this.getTennisPlayer2().getName();
      }
    } else {
      return String.format("%s - %s", SCORES[this.getTennisPlayer1().getScore()],
          SCORES[this.getTennisPlayer2().getScore()]);
    }
  }

  public TennisGame1(TennisPlayer tennisPlayer1, TennisPlayer tennisPlayer2) {
    this.tennisPlayer1 = tennisPlayer1;
    this.tennisPlayer2 = tennisPlayer2;
  }

  private TennisPlayer getTennisPlayer1() {
    return tennisPlayer1;
  }

  private TennisPlayer getTennisPlayer2() {
    return tennisPlayer2;
  }

}
