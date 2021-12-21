import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class Frequency_21122021 {

  public static void main(String[] args) {
    //
    List<Integer> list = new ArrayList<>();
    list.add(44);
    list.add(53);
    list.add(31);
    list.add(27);
    list.add(77);
    list.add(60);
    list.add(66);
    list.add(77);
    list.add(26);
    list.add(36);

    System.out.println(birthdayCakeCandles(list));
  }

  public static int birthdayCakeCandles(List<Integer> candles) {
    // Integer List Sorting
    candles = candles.stream().sorted().collect(Collectors.toList());

    //Highest element frequency in a list
    return Collections.frequency(candles, candles.get(candles.size() - 1));
  }
}
