public class Farm {
  private Animal[] animals = new Animal[12];

  public void breed(int hungry) {
    int i = 0;
    Animal animal = new Animal(hungry);
    while (true) {
      if (this.getAnimals()[i] == null) {
        this.getAnimals()[i] = new Animal(hungry);
        break;
      } else {
        i++;
        if (i >= this.getAnimals().length) {
          break;
        }
      }
    }
  }

  public void slughter() {
    this.getAnimals()[getMinHungry(this)] = null;
  }

  private int getMinHungry(Farm farm) {
    int min = farm.getAnimals()[0].getHungry();
    int minIndex = 0;

    for (int i = 0; i < farm.getAnimals().length; i++) {
      if (farm.getAnimals()[i] != null && farm.getAnimals()[i].getHungry() < min) {
        min = farm.getAnimals()[i].getHungry();
        minIndex = i;
      }
    }
    return minIndex;
  }

  public Animal[] getAnimals() {
    return animals;
  }
}
