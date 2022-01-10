package javasolution;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
@SuppressWarnings("ALL")
public class Practice20211227StaticInitializerBlock {
  public static Scanner scanner = new Scanner(System.in);
  public static int B, H;
  public static boolean flag;

  static {
    B = scanner.nextInt();
    H = scanner.nextInt();
    scanner.close();

    if (B > 0 && H > 0) {
      flag = true;
    } else {
      flag = false;
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
  }

  public static void main(String[] args) {
    if (flag) {
      System.out.println(B * H);
    }
  }
}
