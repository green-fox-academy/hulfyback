import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Main main = new Main();

//    main.createPostIts();
//    main.createBlogPost();
//    main.createAnimals();
//    main.createSharpie();
//    main.createSharpieSet();
    main.createFarm();
  }

  public void createPostIts() {
    PostIt postIt_1 = new PostIt("orange", "Idea 1", "blue");
    PostIt postIt_2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt_3 = new PostIt("yellow", "Superb", "green");
  }

  public void createBlogPost() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    BlogPost blogPost_1 = new BlogPost("John Doe",
        "Lorem Ipsum",
        "Lorem ipsum dolor sit amet.",
        new Date(2000, 5, 4));
    BlogPost blogPost_2 = new BlogPost("Tim Urban",
        "Wait but why",
        "A popular long-form, stick-figure-illustrated blog about almost everything..",
        new Date(2010, 10, 10));
    BlogPost blogPost_3 = new BlogPost("William Turton",
        "One Engineer Is Trying to Get IBM to Reckon With Trump",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
            "When I asked to take his picture outside one of IBM’s New York City offices, he told me that " +
            "he wasn’t really into the whole organizer profile thing.",
        new Date(2017, 3, 28));

    System.out.println("title: " + blogPost_3.getTitle());
    System.out.println("by: " + blogPost_3.getAuthorName());
    System.out.println("date: " + simpleDateFormat.format(blogPost_3.getPublicationDate()));
  }

  public void createAnimals() {
    Animal animal = new Animal();

    Random r = new Random();

    for (int i = 0; i < r.nextInt((10 - 2) + 1) + 2; i++) {
      animal.play();
    };

    for (int i = 0; i < r.nextInt((10 - 2) + 1) + 2; i++) {
      animal.eat();
    }

    for (int i = 0; i < r.nextInt((10 - 2) + 1) + 2; i++) {
      animal.drink();
    }

    System.out.println("hungry: " + animal.getHungry());
    System.out.println("thirst: " + animal.getThirst());




  }

  public void createSharpie() {
    Sharpie sharpie = new Sharpie("blue", 20.5);

    for (int i = 0; i < (int) (1 + Math.random() * 6); i++) {
      sharpie.use();
    }

    System.out.println(sharpie.getInkAmount());
  }

  public void createSharpieSet(){
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.addSharpie(new Sharpie(15));
    sharpieSet.addSharpie(new Sharpie(0));
    sharpieSet.addSharpie(new Sharpie(15));
    sharpieSet.addSharpie(new Sharpie(0));
    sharpieSet.addSharpie(new Sharpie(15));
    sharpieSet.addSharpie(new Sharpie(30));

    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
    System.out.println(sharpieSet.getSharpieList().size());

  }

  private void uploadFarmWithAnimals(Farm farm, int n) {
    for (int i = 0; i < n; i++) {
      farm.breed((int) (Math.random() * 70));
    }
  }

  private void deleteAnimals(Farm farm, int n) {
    for (int i = 0; i < n ; i++) {
      farm.slughter();
    }
  }

  private void printAnimalsByHungar(Farm farm) {
    for (Animal animal : farm.getAnimals()) {
      if (animal != null) {
        System.out.print(animal.toString() + ",");
      } else {
        System.out.print(animal);
        System.out.print(", ");
      }
    }
    System.out.println();
  }

  public void createFarm() {
    Farm farm = new Farm();

    uploadFarmWithAnimals(farm, 15);
    printAnimalsByHungar(farm);
    deleteAnimals(farm, 6);
    printAnimalsByHungar(farm);
    uploadFarmWithAnimals(farm, 3);
    printAnimalsByHungar(farm);
  }
}
