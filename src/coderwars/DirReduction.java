package coderwars;

import java.util.Locale;
import java.util.Stack;

public class DirReduction {
  public static String[] dirReduc(String[] arr) {
    final Stack<String> stack = new Stack<>();

    for (final String direction : arr) {
      final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

      switch (direction) {
        case "NORTH":
          if ("SOUTH".equals(lastElement)) {
            stack.pop();
          } else {
            stack.push(direction);
          }
          break;
        case "SOUTH":
          if ("NORTH".equals(lastElement)) {
            stack.pop();
          } else {
            stack.push(direction);
          }
          break;
        case "EAST":
          if ("WEST".equals(lastElement)) {
            stack.pop();
          } else {
            stack.push(direction);
          }
          break;
        case "WEST":
          if ("EAST".equals(lastElement)) {
            stack.pop();
          } else {
            stack.push(direction);
          }
          break;
      }
    }
    return stack.stream().toArray(String[]::new);
  }
}
