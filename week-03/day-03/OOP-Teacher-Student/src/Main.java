public class Main {

  public static void main(String[] args) {
    Student st1 = new Student("Joe");
    Student st2 = new Student("Jack");

    Teacher t1 = new Teacher("Mrs. Doubtfire");
    Teacher t2 = new Teacher("Mr. Collins");

    st1.question(t1);
    st1.question(t2);
    st2.question(t1);
    st2.question(t2);

  }
}
