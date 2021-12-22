package Java;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-if-else/problem
public class _20211222_elseif {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();

    //one line if
    String output =
        value % 2 == 0
            ? (value > 1 && value < 6
                ? "Not Weird"
                : value > 5 && value < 21 ? "Weird" : value > 20 ? "Not Weird" : "Weird")
            : "Weird";

    System.out.println(output);

    //    if (value >= 2 && value <= 5 && value % 2 == 0) {
    //      System.out.println("Not Weird");
    //    } else if (value >= 6 && value <= 20 && value % 2 == 0) {
    //      System.out.println("Weird");
    //    } else if (value > 20 && value % 2 == 0) {
    //      System.out.println("Not Weird");
    //    } else {
    //      System.out.println("Weird");
    //    }

  }
}
