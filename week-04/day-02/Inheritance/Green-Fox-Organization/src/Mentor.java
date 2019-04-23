public class Mentor extends Person {
  private String level;

  public String getLevel() {
    return level;
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    super.intro();
    System.out.println(getLevel() + " mentor.");
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
}
