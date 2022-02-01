package algorithms;

import java.util.Stack;

/** https://leetcode.com/problems/valid-parentheses/ */
public class Practice20220126StackPop {
  /**
   * main method.
   *
   * @param args java command-line arguments.
   */
  public static void main(String[] args) {
    System.out.println(isValid("({)]})"));
  }

  /**
   * it returns a boolean value if given string has true format.
   *
   * @param s String value which contains special characters.
   * @return boolean value.
   */
  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '{') {
        stack.push('}');
      } else if (c == '[') {
        stack.push(']');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
    return stack.isEmpty();
  }
}
