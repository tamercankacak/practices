package javasolution;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-reverse/problem
public class _20220104_StringReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String reversedA = "";
    for (int i = A.length() - 1; i >= 0; --i) {
      reversedA = reversedA.concat(String.valueOf(A.charAt(i)));
    }
    System.out.println(A.equals(reversedA) ? "Yes" : "No");
  }
}
