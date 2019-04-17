public class Student {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void learn() {

  }

  public void question(Teacher teacher) {
    System.out.println(this.getName() + "'s asking " + teacher.getName());
    teacher.answer(this);

  }
}
