package Java;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-end-of-file/problem
public class _20211224_HasNextScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    while (scanner.hasNext())
      System.out.printf("%d %s%n", count++, scanner.nextLine());
  }
}
