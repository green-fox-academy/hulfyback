public class GardenMain {
  public static void main(String[] args) {
    Flower flower = new Flower(12, "yellow");
    Flower flower1 = new Flower(1, "red");
    Flower flower2 = new Flower(2, "blue");
    Flower flower3 = new Flower(4, "purple");
    Tree tree = new Tree(21, "green");
    Tree tree1 = new Tree(3, "brown");
    Tree tree2 = new Tree(8, "silver");
    Tree tree3 = new Tree(12, "white");

    Garden garden = new Garden();
    garden.addFlower(flower);
    garden.addFlower(flower1);
    garden.addFlower(flower2);
    garden.addFlower(flower3);

    garden.addTree(tree);
    garden.addTree(tree1);
    garden.addTree(tree2);
    garden.addTree(tree3);

    garden.addWaterToPlants(20);
    for (Plant plant: garden.getPlants()) {
      System.out.println(plant.getWaterLevel());
    }

    garden.printPlants();
    garden.addWaterToPlants(10);
    garden.printPlants();
  }
}
