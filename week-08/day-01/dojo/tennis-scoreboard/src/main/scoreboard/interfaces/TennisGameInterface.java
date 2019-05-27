package main.scoreboard.interfaces;

import main.scoreboard.TennisPlayer;

public interface TennisGameInterface {
  String ADVANTAGE = "Advantage for ";
  String WIN = "Win for ";
  static final String[] SCORES = new String[] {"Love","Fifteen","Thirty","Forty","Deuce"};
  static final String ALL = "-All";

  void wonPoint(TennisPlayer player);

  String getScore();
}