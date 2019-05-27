package main.scoreboard;

public class TennisPlayer implements Comparable<TennisPlayer> {
  private String name;
  private int score;
  private String scoreByLetters;

  public TennisPlayer(String name) {
    this.name = name;
    this.score = 0;
  }

  public int getScore() {
    return score;
  }

  public void addScore() {
    this.score +=1;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(TennisPlayer player) {
    return this.getScore() - player.getScore();
  }
}
