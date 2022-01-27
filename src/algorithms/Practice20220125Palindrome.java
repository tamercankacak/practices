package algorithms;

/** https://leetcode.com/problems/palindrome-number/ */
public class Practice20220125Palindrome {
  /**
   * main.
   *
   * @param args maing args.
   */
  public static void main(String[] args) {

    System.out.println(isPalindromeFastest(121));
    System.out.println(isPalindrome(121));
  }

  /**
   * Runtime: 15 ms, faster than 35.64% of Java online submissions for Palindrome Number. Memory
   * Usage: 44.1 MB, less than 5.01% of Java online submissions for Palindrome Number.
   *
   * @param x number.
   * @return isPalindrome.
   */
  public static boolean isPalindrome(int x) {
    String value = new StringBuilder(String.valueOf(x)).reverse().toString();
    return value.equals(String.valueOf(x));
  }

  /**
   * Runtime: 14 ms, faster than 42.14% of Java online submissions for Palindrome Number. Memory
   * Usage: 41.2 MB, less than 34.79% of Java online submissions for Palindrome Number.
   *
   * @param x number.
   * @return isPalindrome.
   */
  public static boolean isPalindromeFastest(int x) {
    if (x < 0 || (x != 0 && x % 10 == 0)) {
      return false;
    }
    int res = 0;
    while (x > res) {
      res = res * 10 + x % 10;
      x = x / 10;
    }
    return (x == res || x == res / 10);
  }
}
