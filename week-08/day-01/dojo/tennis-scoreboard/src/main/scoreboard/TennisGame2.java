package main.scoreboard;

import main.scoreboard.interfaces.TennisGameInterface;

public class TennisGame2 implements TennisGameInterface {

  public int pointOfPlayer1 = 0;
  public int pointOfPlayer2 = 0;

  public String P1res = "";
  public String P2res = "";
  private String player1;
  private String player2;

  public TennisGame2(String player1, String player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public String getScore() {
    String score = "";
    if (pointOfPlayer1 == pointOfPlayer2 && pointOfPlayer1 < 4) {
      if (pointOfPlayer1 == 0) {
        score = "Love";
      }
      if (pointOfPlayer1 == 1) {
        score = "Fifteen";
      }
      if (pointOfPlayer1 == 2) {
        score = "Thirty";
      }
      if (pointOfPlayer1 == 3) {
        score = "Forty";
      }
      score += "-All";
    }
    if (pointOfPlayer1 == pointOfPlayer2 && pointOfPlayer1 > 3) {
      score = "Deuce";
    }

    if (pointOfPlayer1 > 0 && pointOfPlayer2 == 0) {
      if (pointOfPlayer1 == 1) {
        P1res = "Fifteen";
      }
      if (pointOfPlayer1 == 2) {
        P1res = "Thirty";
      }
      if (pointOfPlayer1 == 3) {
        P1res = "Forty";
      }

      P2res = "Love";
      score = P1res + "-" + P2res;
    }
    if (pointOfPlayer2 > 0 && pointOfPlayer1 == 0) {
      if (pointOfPlayer2 == 1) {
        P2res = "Fifteen";
      }
      if (pointOfPlayer2 == 2) {
        P2res = "Thirty";
      }
      if (pointOfPlayer2 == 3) {
        P2res = "Forty";
      }

      P1res = "Love";
      score = P1res + "-" + P2res;
    }

    if (pointOfPlayer1 > pointOfPlayer2 && pointOfPlayer1 < 4) {
      if (pointOfPlayer1 == 2) {
        P1res = "Thirty";
      }
      if (pointOfPlayer1 == 3) {
        P1res = "Forty";
      }
      if (pointOfPlayer2 == 1) {
        P2res = "Fifteen";
      }
      if (pointOfPlayer2 == 2) {
        P2res = "Thirty";
      }
      score = P1res + "-" + P2res;
    }
    if (pointOfPlayer2 > pointOfPlayer1 && pointOfPlayer2 < 4) {
      if (pointOfPlayer2 == 2) {
        P2res = "Thirty";
      }
      if (pointOfPlayer2 == 3) {
        P2res = "Forty";
      }
      if (pointOfPlayer1 == 1) {
        P1res = "Fifteen";
      }
      if (pointOfPlayer1 == 2) {
        P1res = "Thirty";
      }
      score = P1res + "-" + P2res;
    }

    if (pointOfPlayer1 > pointOfPlayer2 && pointOfPlayer2 >= 3) {
      score = "Advantage player1";
    }

    if (pointOfPlayer2 > pointOfPlayer1 && pointOfPlayer1 >= 3) {
      score = "Advantage player2";
    }

    if (pointOfPlayer1 >= 4 && pointOfPlayer2 >= 0 && (pointOfPlayer1 - pointOfPlayer2) >= 2) {
      score = "Win for player1";
    }
    if (pointOfPlayer2 >= 4 && pointOfPlayer1 >= 0 && (pointOfPlayer2 - pointOfPlayer1) >= 2) {
      score = "Win for player2";
    }
    return score;
  }

  public void SetP1Score(int number) {

    for (int i = 0; i < number; i++) {
      P1Score();
    }

  }

  public void SetP2Score(int number) {

    for (int i = 0; i < number; i++) {
      P2Score();
    }

  }

  public void P1Score() {
    pointOfPlayer1++;
  }

  public void P2Score() {
    pointOfPlayer2++;
  }

  public void wonPoint(String player) {
    if (player == "player1") {
      P1Score();
    } else {
      P2Score();
    }
  }
}