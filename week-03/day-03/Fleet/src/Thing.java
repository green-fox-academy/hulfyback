/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing thing) {
    int result = Boolean.compare(this.isCompleted(), thing.isCompleted());
    if (result == 0) {
      result = this.getName().compareTo(thing.getName());
    }
    return result;
  }
}
