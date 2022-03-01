package coderwars;

import java.util.regex.Pattern;

public class Nessie {
  public static boolean isLockNessMonster(String s) {
    return Pattern.matches(".*(tree fiddy|3\\.50|three fifty).*", s);
  }
}
