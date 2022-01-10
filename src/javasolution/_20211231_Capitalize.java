package javasolution;

import java.util.Scanner;
// https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class _20211231_Capitalize {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    System.out.println(A.length() + B.length());
    System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");
    System.out.println(capitalize(A) + " " + capitalize(B));
    //    System.out.println(StringUtils.capitalize(A) + " " + StringUtils.capitalize(B));
  }

  public static String capitalize(String str) {
    if (str == null) return str;
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }
}
