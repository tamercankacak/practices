package coderwars;

public class GetMiddle {
  public static String getMiddle(String word) {
    int length = word.length();
    return length % 2 == 0
        ? word.substring(length / 2 - 1, length / 2 + 1)
        : String.valueOf(word.charAt(length / 2));
  }
}
