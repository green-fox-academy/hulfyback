import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addFlower(Flower flower) {
    this.plants.add(flower);
  }

  public void addTree(Tree tree) {
    this.plants.add(tree);
  }

  public List<Plant> getPlants() {
    return plants;
  }

  private String printIsThirsty(Plant plant) {
    if (plant.isThirsty()) {
      return "The " + plant.toString() + " needs water.";
    } else {
      return "The " + plant.toString() + " doesn't need water.";
    }
  }

  private int getNumberOfThirstyPlants() {
    int numberOfThirstyFlowers = 0;
    for (Plant plant: plants) {
      if (plant.isThirsty()) {
        numberOfThirstyFlowers++;
      }
    }
    return numberOfThirstyFlowers;
  }



  public void addWaterToPlants(double water) {
    int thirstyPlants = getNumberOfThirstyPlants();

    System.out.println("Watering with " + water);
    for (Plant plant: plants) {
      if (plant.isThirsty()) {
        plant.absorbWater(water / thirstyPlants);
      }
    }
  }

  public void printPlants() {
    for (Plant plant: plants) {
      System.out.println(printIsThirsty(plant));
    }
  }
}
