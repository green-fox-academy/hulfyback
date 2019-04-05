package solutions;

public class SubStr {
  public static int subStr(String input, String q) {

    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if t{he second string is not in the first one

    if(input.length() < q.length()){
      return -1;
    }
    else {
      int i = 0;
      while(true){
        if(input.substring(i, i + q.length()).equals(q)){
          return i;
        }
        i++;
        if(i + q.length() == input.length()){
          return -1;
        }
      }
    }
  }
}
