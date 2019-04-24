import main.java.animals.*;

public class Zoo {

  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile");
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    System.out.println();
    System.out.println("How do you eat?");
    System.out.println("A " + reptile.getName() + " is eating by " + reptile.eat());
    System.out.println("A " + mammal.getName() + " is eating by " + mammal.eat());
    System.out.println("A " + bird.getName() + " is eating by " + bird.eat());
    System.out.println();
    System.out.println("How do you move?");
    System.out.println("A " + reptile.getName() + " is " + reptile.move());
    System.out.println("A " + mammal.getName() + " is " + mammal.move());
    System.out.println("A " + bird.getName() + " is " + bird.move());
  }
}