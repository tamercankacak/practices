package coderwars;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {
  public static boolean scramble(String str1, String str2) {
    List<Character> str2List = str2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
    List<Character> str1List = str1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

    long count =
        str2List.stream()
            .filter(x -> Collections.frequency(str1List, x) < Collections.frequency(str2List, x))
            .count();

    return count == 0;
  }

  public static boolean scrambleCodeWars(String str1, String str2) {
    if (str2.length() > str1.length()) return false;
    for (String s : str2.split("")) {
      if (!str1.contains(s)) return false;
      str1 = str1.replaceFirst(s, "");
    }

    return true;
  }
}
