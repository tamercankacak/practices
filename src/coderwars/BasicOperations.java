package coderwars;

/**
 * https://www.codewars.com/kata/57356c55867b9b7a60000bd7/solutions/java
 *
 * @author tamercankacak
 */
public class BasicOperations {
  public static int basicMath(String op, int v1, int v2) {
    int result = 0;
    switch (op) {
      case "+":
        result = v1 + v2;
        break;
      case "-":
        result = v1 - v2;
        break;
      case "*":
        result = v1 * v2;
        break;
      case "/":
        result = v1 / v2;
        break;
    }
    return result;
  }
}
