package main.scoreboard;

import main.scoreboard.interfaces.TennisGameInterface;

public class TennisGame1 implements TennisGameInterface {

  private int scoreOfPlayer1 = 0;
  private int scoreOfPlayer2 = 0;
  private String player1;
  private String player2;

  public TennisGame1(String player1, String player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1") {
      scoreOfPlayer1 += 1;
    } else {
      scoreOfPlayer2 += 1;
    }
  }

  public String getScore() {
    String score = "";
    int tempScore = 0;
    if (scoreOfPlayer1 == scoreOfPlayer2) {
      switch (scoreOfPlayer1) {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;

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
}
