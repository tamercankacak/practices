package Java;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
public class _20211222_Stdin {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    String first = scanner.nextLine();
    String second = scanner.nextLine();
    String third = scanner.nextLine();
    //int integerValue = scanner.nextInt();
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
  }
}
