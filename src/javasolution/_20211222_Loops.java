package javasolution;

import java.util.Scanner;
// https://www.hackerrank.com/challenges/java-loops-i/problem
public class _20211222_Loops {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      //      System.out.println(value + " x " + i + " = " + value * i);
      System.out.printf("%d x %d = %d%n", value, i, value * i);
    }
  }
}
