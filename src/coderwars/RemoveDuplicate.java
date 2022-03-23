package coderwars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {
  public static String removeDuplicateWords(String s) {

    return String.join(" ", Arrays.stream(s.split(" ")).distinct().collect(Collectors.toList()));
  }
}
