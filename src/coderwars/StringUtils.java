package coderwars;

import java.util.regex.Pattern;

public class StringUtils {
  public static boolean isDigit(String s) {
    boolean state = Pattern.compile("\\d").matcher(s).matches();
    return state;
  }

  public static boolean isDigitCodeWars(String s) {
    return s.matches("[0-9]");
  }
}
