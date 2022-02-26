package coderwars;

import java.util.stream.IntStream;

public class CountDig {

  public static int nbDig(int n, int d) {
    int count = 0;
    if (d % 10 == 0) count++;
    for (int i = 0; i <= n; i++) {
      int number = i * i;
      while (number > 0) {
        if (number % 10 == d) count++;
        number /= 10;
      }
    }
    return count;
  }

  public static int nbDigCodeWar(int n, int d) {

    return (int)
        IntStream.rangeClosed(0, n)
            .map(i -> i * i)
            .flatMap(i -> String.valueOf(i).chars())
            .mapToObj(i -> (char) i)
            .mapToInt(Character::getNumericValue)
            .filter(i -> i == d)
            .count();
  }
}
