package javasolution;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-loops/problem
public class Practice20211222Loops2 {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    int inputCount = scanner.nextInt();
    for (int i = 0; i < inputCount; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int n = scanner.nextInt();
      for (int j = 1; j <= n; j++) {
        int total = a;
        for (int k = 0; k < j; k++) {
          total += (b * Math.pow(2, k));
        }

        System.out.printf("%d ", total);
      }
      System.out.println();
    }
  }
}
