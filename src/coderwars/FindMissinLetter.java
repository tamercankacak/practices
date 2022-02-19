package coderwars;

/**
 * https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
 *
 * @author tamercankacak
 */
public class FindMissinLetter {
  public static char findMissingLetter(char[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] != array[i - 1] + 1) {
        return (char) (array[i] - 1);
      }
    }
    return ' ';
  }
}
