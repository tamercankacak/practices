package coderwars;

import java.util.regex.Pattern;

public class ZywOo {
  public static boolean validateUsr(String s) {
    boolean isUsernameCorrect = Pattern.compile("[a-z_\\d]{4,16}").matcher(s).matches();
    return isUsernameCorrect;
  }
}
