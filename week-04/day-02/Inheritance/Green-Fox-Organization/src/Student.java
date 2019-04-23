public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    this.previousOrganization = "School of Life.";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi I am a " + getName()
        + " a " + getAge() + " year old from " + getPreviousOrganization() + " who skipped "
        + getSkippedDays() + "day from the course already.");
  }

  public void skipDays(int skippedDays) {
    skippedDays++;
  }
}
