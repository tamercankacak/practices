package coderwars;

/**
 * https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
 *
 * @author tamercankacak
 */
public class StringRepeat {
  /**
   * it returns repeated string.
   *
   * @param repeat says how many repeats.
   * @param string text.
   * @return return repeated string.
   */
  public static String repeatStr(final int repeat, final String string) {
    return new String(new char[repeat]).replace("\0", string);
  }

  /**
   * it returns repeated string codewars way.
   *
   * @param repeat says how many repeats.
   * @param string text.
   * @return return repeated string.
   */
  public static String repeatStrCodeWars(final int repeat, final String string) {
    String s = "";
    for (int i = 0; i < repeat; i++) s += string;
    return s;
  }
}
