package main.scoreboard.interfaces;

import main.scoreboard.TennisPlayer;

public interface TennisGameInterface {

  void wonPoint(TennisPlayer player);

  String getScore();
}