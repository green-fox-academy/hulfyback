import java.util.ArrayList;
import java.util.List;

public class Colony {
  List<Honeybee> beeList;

  public Colony() {
    beeList = new ArrayList<>();
  }

  public void join(Honeybee bee) {
    beeList.add(bee);
  }

  public void startWork() {
    for (Honeybee bee: beeList) {
      bee.doWork();
    }
  }

  public void defend() {
    for (Honeybee bee: beeList) {
      if(bee instanceof Worker || bee instanceof Queen) {
        ((IStingable) bee).sting();
      }
    }
  }
}
