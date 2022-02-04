package coderwars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
  public static String pigIt(String str) {

    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      String regex = "[^a-zA-Z0-9]+";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(words[i]);
      if (!matcher.matches()) {
        words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
      }
    }

    return String.join(" ", words);
  }

  public static String pigItSolution(String str) {
    return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
  }
}
