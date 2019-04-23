import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> students;
  private List<Mentor> mentors;

  public String getName() {
    return name;
  }

  public List<Student> getStudents() {
    return students;
  }

  public List<Mentor> getMentors() {
    return mentors;
  }

  public Cohort(String name) {
    this.name = name;
    this.mentors = new ArrayList<>();
    this.students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + getName() + " cohort has "
        + students.size() + " students and "
        + mentors.size() + " mentors.");
  }
}
