import java.text.SimpleDateFormat;
import java.util.Date;

public class BlogPost {
  private String authorName;
  private String title;
  private String text;
  private Date publicationDate;

  public BlogPost(String authorName, String title, String text, Date publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  @Override
  public String toString() {
    return ("Name: " + this.getAuthorName() + "\n"
        + "Title: "
        + this.getTitle() + "\n"
        + "Text: " + this.getText() + "\n"
        + "Date: " + new SimpleDateFormat().format(this.getPublicationDate())
        + "\n\n");
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }
}
