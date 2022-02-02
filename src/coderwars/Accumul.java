package coderwars;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Accumul {
  public static String accum(String s) {
    List<String> strList = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      String s1 = String.valueOf(s.charAt(i)).toUpperCase(Locale.ROOT);
      for (int j = 0; j < i; j++) {
        s1 += (String.valueOf(s.charAt(i)).toLowerCase());
      }
      strList.add(s1);
    }
    return String.join("-", strList);
  }

  public static String accumCodeWars(String s) {
    StringBuilder bldr = new StringBuilder();
    int i = 0;
    for (char c : s.toCharArray()) {
      if (i > 0) bldr.append('-');
      bldr.append(Character.toUpperCase(c));
      for (int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
      i++;
    }
    return bldr.toString();
  }
}
