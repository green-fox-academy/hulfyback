package main.scoreboard;

import main.scoreboard.interfaces.TennisGameInterface;

public class TennisGame1 implements TennisGameInterface {

  private TennisPlayer tennisPlayer1;
  private TennisPlayer tennisPlayer2;
  private static final String[] SCORES = new String[] {"Love","Fifteen","Thirty","Forty","Deuce"};
  private static final String ALL = "-All";

  private int scoreOfPlayer1 = 0;
  private int scoreOfPlayer2 = 0;
  private String player1;
  private String player2;

  public TennisGame1(String player1, String player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public TennisGame1(TennisPlayer tennisPlayer1, TennisPlayer tennisPlayer2) {
    this.tennisPlayer1 = tennisPlayer1;
    this.tennisPlayer2 = tennisPlayer2;
  }

  public void wonPoint(TennisPlayer tennisPlayer) {
    tennisPlayer.addScore();
  }

  public String getScore() {
    String score = "";
    int tempScore = 0;

    if (this.getTennisPlayer2().getScore() == this.getTennisPlayer2().getScore()) {
      if (this.getTennisPlayer2().getScore() < 4) {
        return SCORES[this.getTennisPlayer1().getScore()].concat(ALL);
      } else {
        return SCORES[4];
      }


    } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
      int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
      if (minusResult == 1) {
        score = "Advantage player1";
      } else if (minusResult == -1) {
        score = "Advantage player2";
      } else if (minusResult >= 2) {
        score = "Win for player1";
      } else {
        score = "Win for player2";
      }
    } else {
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          tempScore = scoreOfPlayer1;
        } else {
          score += "-";
          tempScore = scoreOfPlayer2;
        }
        switch (tempScore) {
          case 0:
            score += "Love";
            break;
          case 1:
            score += "Fifteen";
            break;
          case 2:
            score += "Thirty";
            break;
          case 3:
            score += "Forty";
            break;
        }
      }
    }
    return score;
  }

  public TennisPlayer getTennisPlayer1() {
    return tennisPlayer1;
  }

  public TennisPlayer getTennisPlayer2() {
    return tennisPlayer2;
  }
}
