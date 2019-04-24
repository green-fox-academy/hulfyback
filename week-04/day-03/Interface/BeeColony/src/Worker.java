public class Worker extends Honeybee implements IStingable, Comparable {

  Sting sting = new Sting();

  @Override
  public void doWork() {
    System.out.println("I am collecting pollens");
  }

  @Override
  public void sting() {
    sting.doSting("Worker");
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
