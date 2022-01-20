package javasolution;

import java.util.Scanner;

/** https://www.hackerrank.com/challenges/valid-username-checker/problem */
public class Practice20220120Regex3 {
  /**
   * Solution method.
   *
   * @param args args parameter.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < scanner.nextInt(); i++) {
      String username = scanner.nextLine();
      if (username.matches(UsernameValidator.regularExpression)) {
        System.out.println("Valid");
      } else {
        System.out.println("Invalid");
      }
    }
  }

  /** Regex Validator. */
  static class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
  }
}
