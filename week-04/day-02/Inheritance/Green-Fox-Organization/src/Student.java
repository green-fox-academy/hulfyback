public class Student extends Person implements Cloneable {
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
    super.getMyGoal();
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    super.intro();
    System.out.println("from " + getPreviousOrganization() + " who skipped "
        + getSkippedDays() + " day from the course already.");
  }

  public void skipDays(int skippedDays) {
    skippedDays++;
  }

  public Student clone(){
    return new Student(this.getName(), this.getAge(), this.getGender(), this.getPreviousOrganization());
  }
}