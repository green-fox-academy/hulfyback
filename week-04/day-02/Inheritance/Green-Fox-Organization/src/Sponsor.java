public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public String getCompany() {
    return company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.hiredStudents = 0;
    this.company = company;
  }

  @Override
  public void introduce() {
    super.introduce();
    System.out.println("who represents " + getCompany() + " and hired " + getHiredStudents() );
  }

  public void hire() {
    hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
