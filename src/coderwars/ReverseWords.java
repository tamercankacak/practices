package coderwars;

public class ReverseWords {
  public static String reverseWords(final String original) {

    String[] strArray = original.split(" ");
    if (strArray.length == 0) return original;
    for (int i = 0; i < strArray.length; i++) {
      strArray[i] = new StringBuilder(strArray[i]).reverse().toString();
    }
    return String.join(" ", strArray);
  }
}
