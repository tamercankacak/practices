package coderwars;

/**
 * Troll.
 */
public class Troll {
  /**
   * Troll.
   *
   * @param str param
   * @return return
   */
  public static String disemvowel(String str) {
    return str.replaceAll("[AaEeIiOoUu]", "");
  }
}
