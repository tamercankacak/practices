package coderwars;

public class FixStringCase {
  public static String solve(final String str) {
    String[] arr = str.split("");
    int upperCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(arr[i].toUpperCase())) {
        upperCount++;
      }
    }
    if (upperCount > arr.length / 2) {
      return str.toUpperCase();
    }
    return str.toLowerCase(); // your code here
  }

  public static String solveCodeWars(final String str) {
    return str.chars().filter(Character::isLowerCase).count()
            >= str.chars().filter(Character::isUpperCase).count()
        ? str.toLowerCase()
        : str.toUpperCase();
  }
}
