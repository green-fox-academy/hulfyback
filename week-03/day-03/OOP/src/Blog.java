import java.util.ArrayList;
import java.util.List;

public class Blog {
  private List<BlogPost> blogposts = new ArrayList<>();

  public List<BlogPost> getBlogposts() {
    return blogposts;
  }

  public void add(BlogPost bp) {
    this.getBlogposts().add(bp);
  }

  public void delete(int i) {
    this.getBlogposts().remove(i);
  }

  public void update(int i, BlogPost bp) {
    this.getBlogposts().set(i, bp);
  }

  @Override
  public String toString() {
    String output = "";
    for (BlogPost bp : this.getBlogposts()) {
      output = output.concat(bp.toString());
    }
    return ("[ " + output.trim() + " ]");
  }
}
