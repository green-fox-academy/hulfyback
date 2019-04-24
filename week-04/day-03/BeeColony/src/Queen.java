public class Queen extends Honeybee implements IStingable{
  Sting sting = new Sting();

  @Override
  public void doWork() {
    System.out.println("Laying eggs");
  }

  @Override
  public void sting() {
    sting.doSting("Queen");
  }
}
