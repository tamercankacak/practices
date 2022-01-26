package algorithms;

/** https://leetcode.com/problems/detect-capital/ */
public class Practice20220124LeetCodeCapital {
  public static void main(String[] args) {
    System.out.println(detectCapitalUse("tamercankacak"));
  }

  /**
   * javadoc ozet.
   *
   * @param word word which controlled capital.
   * @return return capital true.
   */
  public static boolean detectCapitalUse(String word) {
    boolean matchUpperCase = true;
    boolean matchLowerCase = true;
    boolean matchFirstUpperCase = true;

    for (int i = 0; i < word.length(); i++) {
      if (!Character.isUpperCase(word.charAt(i))) {
        if (i == 0) {
          matchUpperCase = false;
          matchFirstUpperCase = false;
        } else {
          matchUpperCase = false;
        }
      } else {
        if (i == 0) {
          matchLowerCase = false;
        } else {
          matchLowerCase = false;
          matchFirstUpperCase = false;
        }
      }
    }
    return matchUpperCase || matchLowerCase || matchFirstUpperCase;
  }
}
