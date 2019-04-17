import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  int countOfUsableSharpies = 0;
  private List<Sharpie> sharpieList = new ArrayList<>();

  public List<Sharpie> getSharpieList() {
    return sharpieList;
  }

  public void setSharpieList(List<Sharpie> sharpieList) {
    this.sharpieList = sharpieList;
  }

  public void addSharpie(Sharpie sharpie) {
    this.getSharpieList().add(sharpie);
  }

  public int countUsable() {
    this.countOfUsableSharpies = 0;
    for (Sharpie sharpie : this.getSharpieList()) {
      if (sharpie.getInkAmount() != 0.0f) {
        this.countOfUsableSharpies++;
      }
    }
    return countOfUsableSharpies;
  }

  public void removeTrash() {
    List<Sharpie> removableSharpies = new ArrayList<>();
    for (Sharpie sharpie : this.getSharpieList()) {
      if (sharpie.getInkAmount() == 0.0f) {
        removableSharpies.add(sharpie);
      }
    }

    for (Sharpie sharpie : removableSharpies) {
      this.getSharpieList().remove(sharpie);
    }
  }
}
