package coderwars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
  public static String reverseWords(final String original) {

    String[] strArray = original.split(" ");
    if (strArray.length == 0) return original;
    for (int i = 0; i < strArray.length; i++) {
      strArray[i] = new StringBuilder(strArray[i]).reverse().toString();
    }
    return String.join(" ", strArray);
  }

  public static String reverseWords2(String str) {
    List Words = Arrays.asList(str.split(" "));
    Collections.reverse(Words);
    return String.join(" ", Words);
  }
}
