package coderwars;

public class ReverseLetter {
  public static String reverseLetter(final String str) {
    String strReplaced = str.replaceAll("[^a-zA-Z]", "");
    return new StringBuilder(strReplaced).reverse().toString(); // coding and coding..
  }
}
