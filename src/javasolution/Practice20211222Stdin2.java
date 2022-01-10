package javasolution;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-stdin-stdout/problem
public class Practice20211222Stdin2 {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);

    int intValue = scanner.nextInt();
    scanner.nextLine();
    double doubleValue = scanner.nextDouble();
    scanner.nextLine();
    String stringValue = scanner.nextLine();

    System.out.println("String: " + stringValue);
    System.out.println("Double: " + doubleValue);
    System.out.println("Int: " + intValue);
  }
}
