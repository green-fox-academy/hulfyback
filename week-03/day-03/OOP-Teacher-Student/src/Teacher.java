public class Teacher {
  private String name;

  public Teacher(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void teach() {

  }

  public void answer(Student student) {
    System.out.println(this.getName() + "'s answering to " + student.getName());
  }
}
