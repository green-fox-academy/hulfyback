package main.java.animals;

public interface ILayingEggs {
  default String breeding() {
    return "laying eggs";
  }
}
