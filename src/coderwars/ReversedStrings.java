package coderwars;

public class ReversedStrings {
  public static String solution(String str) {
    StringBuilder builder = new StringBuilder();
    builder.append(str);
    String reversedStr = builder.reverse().toString();
    return reversedStr;
  }

  public static String solutionCodeWars(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
