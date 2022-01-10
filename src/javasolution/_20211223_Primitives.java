package javasolution;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-datatypes/problem
public class _20211223_Primitives {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    int counter = scanner.nextInt();

    for (int i = 0; i < counter; i++) {

      try {
        long value = scanner.nextLong();
        System.out.println(value + " can be fitted in:");
        if (value <= Byte.MAX_VALUE && value >= Byte.MIN_VALUE) System.out.println("* byte");
        if (value <= Short.MAX_VALUE && value >= Short.MIN_VALUE) System.out.println("* short");
        if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) System.out.println("* int");
        if (value <= Long.MAX_VALUE && value >= Long.MIN_VALUE) System.out.println("* long");
      } catch (Exception e) {
        System.out.println(scanner.next() + " can't be fitted anywhere.");
      }
    }
  }
}
