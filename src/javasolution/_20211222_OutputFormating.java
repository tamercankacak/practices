package javasolution;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-output-formatting/problem
public class _20211222_OutputFormating {
  public static void main(String[] args) {
    //
    Scanner scanner = new Scanner(System.in);
    System.out.println("================================");

    for(int i = 0; i < 3; i++){
      String stringValue = scanner.next();
      int integerValue = scanner.nextInt();
      System.out.printf("%-15s%03d%n", stringValue, integerValue);
      /*
      * - => used for left indentation of the string
      * 15s => mininmum length of string
      * 0 => pads the extra 0s in the integer
      * 3d => 3 denotes integer's minimum field width 3
      * %n => new line
      * */
    }

    System.out.println("================================");
  }
}
