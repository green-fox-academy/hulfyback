package main.scoreboard;

public class TennisPlayer implements Comparable<TennisPlayer> {
  private String name;
  private int score;

  @Override
  public int compareTo(TennisPlayer player) {
    return this.getScore() - player.getScore();
  }

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
}
