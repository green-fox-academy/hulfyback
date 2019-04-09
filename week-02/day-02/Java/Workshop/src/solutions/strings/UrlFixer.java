//package solutions.strings;

public class UrlFixer {
  public static void main(String... args){
    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    String url = "https//www.reddit.com/r/nevertellmethebots";
    url = url.split("//")[0] + "://" + url.split("//")[1];

    String url1 = url.replace("bots", "odds");
    String url2 = url.substring(0, url.indexOf("bots")).concat("odds");
    String url3 = url.split("b")[0].concat("odds");


    System.out.println("url1: " + url1);
    System.out.println("url2: " + url2);
    System.out.println("url3: " + url3);
  }
}
