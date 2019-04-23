import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Flower> flowers;
  List<Tree> trees;

  public Garden() {
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
  }

  public void addFlower(Flower flower) {
    this.flowers.add(flower);
  }

  public void addTree(Tree tree) {
    this.trees.add(tree);
  }
}
