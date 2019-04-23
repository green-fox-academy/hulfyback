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

  public String printIsThirsty(Plant plant) {
    if (plant.isThirsty()) {
      return "The " + plant.toString() + " needs water.";
    } else {
      return "The " + plant.toString() + " doesn't need water.";
    }
  }

  private int getNumberOfThirstyFlowers() {
    int numberOfThirstyFlowers = 0;
    for (Flower flower: flowers) {
      if (flower.isThirsty()) {
        numberOfThirstyFlowers++;
      }
    }
    return numberOfThirstyFlowers;
  }

  private int getNumberOfThirstyTrees() {
    int numberOfThirstyTrees = 0;
    for (Tree tree: trees) {
      if (tree.isThirsty()) {
        numberOfThirstyTrees++;
      }
    }
    return numberOfThirstyTrees;
  }

  private int getNumberOfThirstyPlants() {
    return getNumberOfThirstyFlowers() + getNumberOfThirstyTrees();
  }

  private void addWaterToFlowers(double water) {
    for (Flower flower: flowers) {
      if (flower.isThirsty()) {
        flower.absorbWater(water / getNumberOfThirstyPlants());
      }
    }
  }

  private void addWaterToTrees(double water) {
    for (Tree tree: trees) {
      if (tree.isThirsty()) {
        tree.absorbWater(water / getNumberOfThirstyPlants());
      }
    }
  }

  public void addWater(double water) {
    System.out.println("Watering with " + water);
    addWaterToFlowers(water);
    addWaterToTrees(water);
  }
}
