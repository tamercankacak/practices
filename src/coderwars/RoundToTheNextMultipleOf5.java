package coderwars;

/**
 * https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java
 *
 * @author tamercankacak
 */
public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    int result = 0;
    if (number > 0) {
      result = number % 5 == 0 ? number : number + (5 - number % 5);
    } else if (number < 0) {
      result = number % 5 == 0 ? number : number - number % 5;
    }
    return result;
  }

  public static int roundToNext5CodeWars(int number) {
    while (number % 5 != 0) {
      number++;
    }
    return number;
  }
}
